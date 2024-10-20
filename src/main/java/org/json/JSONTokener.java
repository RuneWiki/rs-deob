package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class JSONTokener {

    public Reader reader;

    public boolean eof;

    public boolean usePrevious;

    public char previous;

    public long index;

    public long character;

    public long line;

    public JSONTokener(Reader arg0) {
        this.reader = arg0.markSupported() ? arg0 : new BufferedReader(arg0);
        this.eof = false;
        this.usePrevious = false;
        this.previous = 0;
        this.index = 0L;
        this.character = 1L;
        this.line = 1L;
    }

    public JSONTokener(InputStream arg0) throws JSONException {
        this((Reader) (new InputStreamReader(arg0)));
    }

    public JSONTokener(String arg0) {
        this((Reader) (new StringReader(arg0)));
    }

    public void back() throws JSONException {
        if (this.usePrevious || this.index <= 0L) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.index--;
        this.character--;
        this.usePrevious = true;
        this.eof = false;
    }

    public static int dehexchar(char arg0) {
        if (arg0 >= '0' && arg0 <= '9') {
            return arg0 - '0';
        } else if (arg0 >= 'A' && arg0 <= 'F') {
            return arg0 - '7';
        } else if (arg0 >= 'a' && arg0 <= 'f') {
            return arg0 - 'W';
        } else {
            return -1;
        }
    }

    public boolean end() {
        return this.eof && !this.usePrevious;
    }

    public boolean more() throws JSONException {
        this.next();
        if (this.end()) {
            return false;
        } else {
            this.back();
            return true;
        }
    }

    public char next() throws JSONException {
        int var1;
        if (this.usePrevious) {
            this.usePrevious = false;
            var1 = this.previous;
        } else {
            try {
                var1 = this.reader.read();
            } catch (IOException var3) {
                throw new JSONException(var3);
            }
            if (var1 <= 0) {
                this.eof = true;
                var1 = 0;
            }
        }
        this.index++;
        if (this.previous == '\r') {
            this.line++;
            this.character = var1 == 10 ? 0L : 1L;
        } else if (var1 == 10) {
            this.line++;
            this.character = 0L;
        } else {
            this.character++;
        }
        this.previous = (char) var1;
        return this.previous;
    }

    public char next(char arg0) throws JSONException {
        char var2 = this.next();
        if (arg0 != var2) {
            throw this.syntaxError("Expected '" + arg0 + "' and instead saw '" + var2 + "'");
        }
        return var2;
    }

    public String next(int arg0) throws JSONException {
        if (arg0 == 0) {
            return "";
        }
        char[] var2 = new char[arg0];
        for (int var3 = 0; var3 < arg0; var3++) {
            var2[var3] = this.next();
            if (this.end()) {
                throw this.syntaxError("Substring bounds error");
            }
        }
        return new String(var2);
    }

    public char nextClean() throws JSONException {
        char var1;
        do {
            var1 = this.next();
        } while (var1 != 0 && var1 <= ' ');
        return var1;
    }

    public String nextString(char arg0) throws JSONException {
        StringBuffer var2 = new StringBuffer();
        while (true) {
            char var3 = this.next();
            switch(var3) {
                case '\u0000':
                case '\n':
                case '\r':
                    throw this.syntaxError("Unterminated string");
                case '\\':
                    char var4 = this.next();
                    switch(var4) {
                        case '"':
                        case '\'':
                        case '/':
                        case '\\':
                            var2.append(var4);
                            continue;
                        case 'b':
                            var2.append('\b');
                            continue;
                        case 'f':
                            var2.append('\f');
                            continue;
                        case 'n':
                            var2.append('\n');
                            continue;
                        case 'r':
                            var2.append('\r');
                            continue;
                        case 't':
                            var2.append('\t');
                            continue;
                        case 'u':
                            var2.append((char) Integer.parseInt(this.next((int) 4), 16));
                            continue;
                        default:
                            throw this.syntaxError("Illegal escape.");
                    }
                default:
                    if (arg0 == var3) {
                        return var2.toString();
                    }
                    var2.append(var3);
            }
        }
    }

    public String nextTo(char arg0) throws JSONException {
        StringBuffer var2 = new StringBuffer();
        while (true) {
            char var3 = this.next();
            if (arg0 == var3 || var3 == 0 || var3 == '\n' || var3 == '\r') {
                if (var3 != 0) {
                    this.back();
                }
                return var2.toString().trim();
            }
            var2.append(var3);
        }
    }

    public String nextTo(String arg0) throws JSONException {
        StringBuffer var2 = new StringBuffer();
        while (true) {
            char var3 = this.next();
            if (arg0.indexOf(var3) >= 0 || var3 == 0 || var3 == '\n' || var3 == '\r') {
                if (var3 != 0) {
                    this.back();
                }
                return var2.toString().trim();
            }
            var2.append(var3);
        }
    }

    public Object nextValue() throws JSONException {
        char var1 = this.nextClean();
        switch(var1) {
            case '"':
            case '\'':
                return this.nextString(var1);
            case '[':
                this.back();
                return new JSONArray(this);
            case '{':
                this.back();
                return new JSONObject(this);
            default:
                StringBuffer var2 = new StringBuffer();
                while (var1 >= ' ' && ",:]}/\\\"[{;=#".indexOf(var1) < 0) {
                    var2.append(var1);
                    var1 = this.next();
                }
                this.back();
                String var3 = var2.toString().trim();
                if ("".equals(var3)) {
                    throw this.syntaxError("Missing value");
                } else {
                    return JSONObject.stringToValue(var3);
                }
        }
    }

    public char skipTo(char arg0) throws JSONException {
        char var8;
        try {
            long var2 = this.index;
            long var4 = this.character;
            long var6 = this.line;
            this.reader.mark(1000000);
            do {
                var8 = this.next();
                if (var8 == 0) {
                    this.reader.reset();
                    this.index = var2;
                    this.character = var4;
                    this.line = var6;
                    return var8;
                }
            } while (arg0 != var8);
        } catch (IOException var10) {
            throw new JSONException(var10);
        }
        this.back();
        return var8;
    }

    public JSONException syntaxError(String arg0) {
        return new JSONException(arg0 + this.toString());
    }

    public String toString() {
        return " at " + this.index + " [character " + this.character + " line " + this.line + "]";
    }

    public String ado() {
        return " at " + this.index + " [character " + this.character + " line " + this.line + "]";
    }

    public String adb() {
        return " at " + this.index + " [character " + this.character + " line " + this.line + "]";
    }
}
