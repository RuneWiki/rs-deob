package org.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JSONTokener {

    public Reader reader;

    public boolean useLastChar;

    public int index;

    public char lastChar;

    public JSONTokener(Reader arg0) {
        this.reader = arg0.markSupported() ? arg0 : new BufferedReader(arg0);
        this.useLastChar = false;
        this.index = 0;
    }

    public JSONTokener(String arg0) {
        this((Reader) (new StringReader(arg0)));
    }

    public void back() throws JSONException {
        if (this.useLastChar || this.index <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.index--;
        this.useLastChar = true;
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

    public boolean more() throws JSONException {
        char var1 = this.next();
        if (var1 == 0) {
            return false;
        } else {
            this.back();
            return true;
        }
    }

    public char next() throws JSONException {
        if (this.useLastChar) {
            this.useLastChar = false;
            if (this.lastChar != 0) {
                this.index++;
            }
            return this.lastChar;
        }
        int var1;
        try {
            var1 = this.reader.read();
        } catch (IOException var3) {
            throw new JSONException(var3);
        }
        if (var1 <= 0) {
            this.lastChar = 0;
            return '\u0000';
        } else {
            this.index++;
            this.lastChar = (char) var1;
            return this.lastChar;
        }
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
        int var3 = 0;
        if (this.useLastChar) {
            this.useLastChar = false;
            var2[0] = this.lastChar;
            var3 = 1;
        }
        int var4;
        try {
            while (var3 < arg0 && (var4 = this.reader.read(var2, var3, arg0 - var3)) != -1) {
                var3 += var4;
            }
        } catch (IOException var6) {
            throw new JSONException(var6);
        }
        this.index += var3;
        if (var3 < arg0) {
            throw this.syntaxError("Substring bounds error");
        }
        this.lastChar = var2[arg0 - 1];
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
                        case 'b':
                            var2.append('\b');
                            continue;
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 's':
                        case 'v':
                        case 'w':
                        default:
                            var2.append(var4);
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
                        case 'x':
                            var2.append((char) Integer.parseInt(this.next((int) 2), 16));
                            continue;
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
            case '(':
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
                if (var3.equals("")) {
                    throw this.syntaxError("Missing value");
                } else {
                    return JSONObject.stringToValue(var3);
                }
        }
    }

    public char skipTo(char arg0) throws JSONException {
        char var3;
        try {
            int var2 = this.index;
            this.reader.mark(Integer.MAX_VALUE);
            do {
                var3 = this.next();
                if (var3 == 0) {
                    this.reader.reset();
                    this.index = var2;
                    return var3;
                }
            } while (arg0 != var3);
        } catch (IOException var5) {
            throw new JSONException(var5);
        }
        this.back();
        return var3;
    }

    public JSONException syntaxError(String arg0) {
        return new JSONException(arg0 + this.toString());
    }

    public String ahc() {
        return " at character " + this.index;
    }

    public String toString() {
        return " at character " + this.index;
    }

    public String ahb() {
        return " at character " + this.index;
    }

    public String ahk() {
        return " at character " + this.index;
    }
}
