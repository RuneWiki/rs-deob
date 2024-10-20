package org.bouncycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;

public final class Strings {

    public static String LINE_SEPARATOR;

    public static String fromByteArray(byte[] arg0) {
        return new String(asCharArray(arg0));
    }

    public static String toLowerCase(String arg0) {
        boolean var1 = false;
        char[] var2 = arg0.toCharArray();
        for (int var3 = 0; var3 != var2.length; var3++) {
            char var4 = var2[var3];
            if ('A' <= var4 && 'Z' >= var4) {
                var1 = true;
                var2[var3] = (char) (var4 - 'A' + 97);
            }
        }
        if (var1) {
            return new String(var2);
        } else {
            return arg0;
        }
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new Strings.StringListImpl();
    }

    public static void toUTF8ByteArray(char[] arg0, OutputStream arg1) throws IOException {
        char[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var4 = var2[var3];
            if (var4 < 128) {
                arg1.write(var4);
            } else if (var4 < 2048) {
                arg1.write(0xC0 | var4 >> 6);
                arg1.write(0x80 | var4 & 0x3F);
            } else if (var4 >= 55296 && var4 <= 57343) {
                if (var3 + 1 >= var2.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                var3++;
                char var6 = var2[var3];
                if (var4 > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int var8 = ((var4 & 0x3FF) << 10 | var6 & 0x3FF) + 65536;
                arg1.write(0xF0 | var8 >> 18);
                arg1.write(0x80 | var8 >> 12 & 0x3F);
                arg1.write(0x80 | var8 >> 6 & 0x3F);
                arg1.write(0x80 | var8 & 0x3F);
            } else {
                arg1.write(0xE0 | var4 >> 12);
                arg1.write(0x80 | var4 >> 6 & 0x3F);
                arg1.write(0x80 | var4 & 0x3F);
            }
        }
    }

    public static String toUpperCase(String arg0) {
        boolean var1 = false;
        char[] var2 = arg0.toCharArray();
        for (int var3 = 0; var3 != var2.length; var3++) {
            char var4 = var2[var3];
            if ('a' <= var4 && 'z' >= var4) {
                var1 = true;
                var2[var3] = (char) (var4 - 'a' + 65);
            }
        }
        if (var1) {
            return new String(var2);
        } else {
            return arg0;
        }
    }

    public static byte[] toUTF8ByteArray(char[] arg0) {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(arg0, var1);
        } catch (IOException var3) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
        return var1.toByteArray();
    }

    public static byte[] toUTF8ByteArray(String arg0) {
        return toUTF8ByteArray(arg0.toCharArray());
    }

    public static byte[] toByteArray(String arg0) {
        byte[] var1 = new byte[arg0.length()];
        for (int var2 = 0; var2 != var1.length; var2++) {
            char var3 = arg0.charAt(var2);
            var1[var2] = (byte) var3;
        }
        return var1;
    }

    public static int toByteArray(String arg0, byte[] arg1, int arg2) {
        int var3 = arg0.length();
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = arg0.charAt(var4);
            arg1[arg2 + var4] = (byte) var5;
        }
        return var3;
    }

    public static byte[] toByteArray(char[] arg0) {
        byte[] var1 = new byte[arg0.length];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = (byte) arg0[var2];
        }
        return var1;
    }

    public static char[] asCharArray(byte[] arg0) {
        char[] var1 = new char[arg0.length];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = (char) (arg0[var2] & 0xFF);
        }
        return var1;
    }

    public static String[] split(String arg0, char arg1) {
        Vector var2 = new Vector();
        boolean var3 = true;
        while (var3) {
            int var4 = arg0.indexOf(arg1);
            if (var4 > 0) {
                String var5 = arg0.substring(0, var4);
                var2.addElement(var5);
                arg0 = arg0.substring(var4 + 1);
            } else {
                var3 = false;
                var2.addElement(arg0);
            }
        }
        String[] var6 = new String[var2.size()];
        for (int var7 = 0; var7 != var6.length; var7++) {
            var6[var7] = (String) var2.elementAt(var7);
        }
        return var6;
    }

    public static String fromUTF8ByteArray(byte[] arg0) {
        int var1 = 0;
        int var2 = 0;
        while (var1 < arg0.length) {
            var2++;
            if ((arg0[var1] & 0xF0) == 240) {
                var2++;
                var1 += 4;
            } else if ((arg0[var1] & 0xE0) == 224) {
                var1 += 3;
            } else if ((arg0[var1] & 0xC0) == 192) {
                var1 += 2;
            } else {
                var1++;
            }
        }
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        while (var4 < arg0.length) {
            char var10;
            if ((arg0[var4] & 0xF0) == 240) {
                int var6 = (arg0[var4] & 0x3) << 18 | (arg0[var4 + 1] & 0x3F) << 12 | (arg0[var4 + 2] & 0x3F) << 6 | arg0[var4 + 3] & 0x3F;
                int var7 = var6 - 65536;
                char var8 = (char) (0xD800 | var7 >> 10);
                char var9 = (char) (0xDC00 | var7 & 0x3FF);
                var3[var5++] = var8;
                var10 = var9;
                var4 += 4;
            } else if ((arg0[var4] & 0xE0) == 224) {
                var10 = (char) ((arg0[var4] & 0xF) << 12 | (arg0[var4 + 1] & 0x3F) << 6 | arg0[var4 + 2] & 0x3F);
                var4 += 3;
            } else if ((arg0[var4] & 0xD0) == 208) {
                var10 = (char) ((arg0[var4] & 0x1F) << 6 | arg0[var4 + 1] & 0x3F);
                var4 += 2;
            } else if ((arg0[var4] & 0xC0) == 192) {
                var10 = (char) ((arg0[var4] & 0x1F) << 6 | arg0[var4 + 1] & 0x3F);
                var4 += 2;
            } else {
                var10 = (char) (arg0[var4] & 0xFF);
                var4++;
            }
            var3[var5++] = var10;
        }
        return new String(var3);
    }

    static {
        try {
            LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction() {

                public String run() {
                    return System.getProperty("line.separator");
                }
            });
        } catch (Exception var3) {
            try {
                LINE_SEPARATOR = String.format("%n");
            } catch (Exception var2) {
                LINE_SEPARATOR = "\n";
            }
        }
    }

    static class StringListImpl extends ArrayList implements StringList {

        // $FF: synthetic method
        public StringListImpl(Object arg0) {
            this();
        }

        public String[] toStringArray() {
            String[] var1 = new String[this.size()];
            for (int var2 = 0; var2 != var1.length; var2++) {
                var1[var2] = (String) this.get(var2);
            }
            return var1;
        }

        public String[] toStringArray(int arg0, int arg1) {
            String[] var3 = new String[arg1 - arg0];
            for (int var4 = arg0; var4 != this.size() && arg1 != var4; var4++) {
                var3[var4 - arg0] = (String) this.get(var4);
            }
            return var3;
        }

        public void add(int arg0, String arg1) {
            super.add(arg0, arg1);
        }

        public StringListImpl() {
        }

        public boolean add(String arg0) {
            return super.add(arg0);
        }

        public String set(int arg0, String arg1) {
            return (String) super.set(arg0, arg1);
        }
    }
}
