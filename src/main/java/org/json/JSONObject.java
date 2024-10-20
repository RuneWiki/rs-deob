package org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Map.Entry;

public class JSONObject {

    public static final Object NULL = new JSONObject.Null();

    public Map map;

    public JSONObject() {
        this.map = new HashMap();
    }

    public JSONObject(JSONObject arg0, String[] arg1) throws JSONException {
        this();
        for (int var3 = 0; var3 < arg1.length; var3++) {
            this.putOnce(arg1[var3], arg0.opt(arg1[var3]));
        }
    }

    public JSONObject(JSONTokener arg0) throws JSONException {
        this();
        if (arg0.nextClean() != '{') {
            throw arg0.syntaxError("A JSONObject text must begin with '{'");
        }
        while (true) {
            char var2 = arg0.nextClean();
            switch(var2) {
                case '\u0000':
                    throw arg0.syntaxError("A JSONObject text must end with '}'");
                case '}':
                    return;
                default:
                    arg0.back();
                    String var3 = arg0.nextValue().toString();
                    char var4 = arg0.nextClean();
                    if (var4 == '=') {
                        if (arg0.next() != '>') {
                            arg0.back();
                        }
                    } else if (var4 != ':') {
                        throw arg0.syntaxError("Expected a ':' after a key");
                    }
                    this.putOnce(var3, arg0.nextValue());
                    switch(arg0.nextClean()) {
                        case ',':
                        case ';':
                            if (arg0.nextClean() == '}') {
                                return;
                            }
                            arg0.back();
                            break;
                        case '}':
                            return;
                        default:
                            throw arg0.syntaxError("Expected a ',' or '}'");
                    }
            }
        }
    }

    public JSONObject(Map arg0) {
        this.map = arg0 == null ? new HashMap() : arg0;
    }

    public JSONObject(Map arg0, boolean arg1) {
        this.map = new HashMap();
        if (arg0 != null) {
            Iterator var3 = arg0.entrySet().iterator();
            while (var3.hasNext()) {
                Entry var4 = (Entry) var3.next();
                this.map.put(var4.getKey(), new JSONObject(var4.getValue(), arg1));
            }
        }
    }

    public JSONObject(Object arg0) {
        this();
        this.populateInternalMap(arg0, false);
    }

    public JSONObject(Object arg0, boolean arg1) {
        this();
        this.populateInternalMap(arg0, arg1);
    }

    public void populateInternalMap(Object arg0, boolean arg1) {
        Class var3 = arg0.getClass();
        if (var3.getClassLoader() == null) {
            arg1 = false;
        }
        Method[] var4 = arg1 ? var3.getMethods() : var3.getDeclaredMethods();
        for (int var5 = 0; var5 < var4.length; var5++) {
            try {
                Method var6 = var4[var5];
                String var7 = var6.getName();
                String var8 = "";
                if (var7.startsWith("get")) {
                    var8 = var7.substring(3);
                } else if (var7.startsWith("is")) {
                    var8 = var7.substring(2);
                }
                if (var8.length() > 0 && Character.isUpperCase(var8.charAt(0)) && var6.getParameterTypes().length == 0) {
                    if (var8.length() == 1) {
                        var8 = var8.toLowerCase();
                    } else if (!Character.isUpperCase(var8.charAt(1))) {
                        var8 = var8.substring(0, 1).toLowerCase() + var8.substring(1);
                    }
                    Object var9 = var6.invoke(arg0, (Object[]) null);
                    if (var9 == null) {
                        this.map.put(var8, NULL);
                    } else if (var9.getClass().isArray()) {
                        this.map.put(var8, new JSONArray(var9, arg1));
                    } else if (var9 instanceof Collection) {
                        this.map.put(var8, new JSONArray((Collection) var9, arg1));
                    } else if (var9 instanceof Map) {
                        this.map.put(var8, new JSONObject((Map) var9, arg1));
                    } else if (this.isStandardProperty(var9.getClass())) {
                        this.map.put(var8, var9);
                    } else if (var9.getClass().getPackage().getName().startsWith("java") || var9.getClass().getClassLoader() == null) {
                        this.map.put(var8, var9.toString());
                    } else {
                        this.map.put(var8, new JSONObject(var9, arg1));
                    }
                }
            } catch (Exception var11) {
                throw new RuntimeException(var11);
            }
        }
    }

    public boolean isStandardProperty(Class arg0) {
        return arg0.isPrimitive() || arg0.isAssignableFrom(Byte.class) || arg0.isAssignableFrom(Short.class) || arg0.isAssignableFrom(Integer.class) || arg0.isAssignableFrom(Long.class) || arg0.isAssignableFrom(Float.class) || arg0.isAssignableFrom(Double.class) || arg0.isAssignableFrom(Character.class) || arg0.isAssignableFrom(String.class) || arg0.isAssignableFrom(Boolean.class);
    }

    public JSONObject(Object arg0, String[] arg1) {
        this();
        Class var3 = arg0.getClass();
        for (int var4 = 0; var4 < arg1.length; var4++) {
            String var5 = arg1[var4];
            try {
                this.putOpt(var5, var3.getField(var5).get(arg0));
            } catch (Exception var7) {
            }
        }
    }

    public JSONObject(String arg0) throws JSONException {
        this(new JSONTokener(arg0));
    }

    public JSONObject accumulate(String arg0, Object arg1) throws JSONException {
        testValidity(arg1);
        Object var3 = this.opt(arg0);
        if (var3 == null) {
            this.put(arg0, arg1 instanceof JSONArray ? (new JSONArray()).put(arg1) : arg1);
        } else if (var3 instanceof JSONArray) {
            ((JSONArray) var3).put(arg1);
        } else {
            this.put(arg0, (Object) (new JSONArray()).put(var3).put(arg1));
        }
        return this;
    }

    public JSONObject append(String arg0, Object arg1) throws JSONException {
        testValidity(arg1);
        Object var3 = this.opt(arg0);
        if (var3 == null) {
            this.put(arg0, (Object) (new JSONArray()).put(arg1));
        } else if ((var3 instanceof JSONArray)) {
            this.put(arg0, (Object) ((JSONArray) var3).put(arg1));
        } else {
            throw new JSONException("JSONObject[" + arg0 + "] is not a JSONArray.");
        }
        return this;
    }

    public static String doubleToString(double arg0) {
        if (Double.isInfinite(arg0) || Double.isNaN(arg0)) {
            return "null";
        }
        String var2 = Double.toString(arg0);
        if (var2.indexOf(46) > 0 && var2.indexOf(101) < 0 && var2.indexOf(69) < 0) {
            while (var2.endsWith("0")) {
                var2 = var2.substring(0, var2.length() - 1);
            }
            if (var2.endsWith(".")) {
                var2 = var2.substring(0, var2.length() - 1);
            }
        }
        return var2;
    }

    public Object get(String arg0) throws JSONException {
        Object var2 = this.opt(arg0);
        if (var2 == null) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] not found.");
        }
        return var2;
    }

    public boolean getBoolean(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        if (var2.equals(Boolean.FALSE) || var2 instanceof String && ((String) var2).equalsIgnoreCase("false")) {
            return false;
        } else if (var2.equals(Boolean.TRUE) || var2 instanceof String && ((String) var2).equalsIgnoreCase("true")) {
            return true;
        } else {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not a Boolean.");
        }
    }

    public double getDouble(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        try {
            return var2 instanceof Number ? ((Number) var2).doubleValue() : Double.valueOf((String) var2);
        } catch (Exception var4) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not a number.");
        }
    }

    public int getInt(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        return var2 instanceof Number ? ((Number) var2).intValue() : (int) this.getDouble(arg0);
    }

    public JSONArray getJSONArray(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        if (!var2 instanceof JSONArray) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not a JSONArray.");
        }
        return (JSONArray) var2;
    }

    public JSONObject getJSONObject(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        if (!var2 instanceof JSONObject) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not a JSONObject.");
        }
        return (JSONObject) var2;
    }

    public long getLong(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        return var2 instanceof Number ? ((Number) var2).longValue() : (long) this.getDouble(arg0);
    }

    public static String[] getNames(JSONObject arg0) {
        int var1 = arg0.length();
        if (var1 == 0) {
            return null;
        }
        Iterator var2 = arg0.keys();
        String[] var3 = new String[var1];
        int var4 = 0;
        while (var2.hasNext()) {
            var3[var4] = (String) var2.next();
            var4++;
        }
        return var3;
    }

    public static String[] getNames(Object arg0) {
        if (arg0 == null) {
            return null;
        }
        Class var1 = arg0.getClass();
        Field[] var2 = var1.getFields();
        int var3 = var2.length;
        if (var3 == 0) {
            return null;
        }
        String[] var4 = new String[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2[var5].getName();
        }
        return var4;
    }

    public String getString(String arg0) throws JSONException {
        return this.get(arg0).toString();
    }

    public boolean has(String arg0) {
        return this.map.containsKey(arg0);
    }

    public boolean isNull(String arg0) {
        return NULL.equals(this.opt(arg0));
    }

    public Iterator keys() {
        return this.map.keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        JSONArray var1 = new JSONArray();
        Iterator var2 = this.keys();
        while (var2.hasNext()) {
            var1.put(var2.next());
        }
        return var1.length() == 0 ? null : var1;
    }

    public static String numberToString(Number arg0) throws JSONException {
        if (arg0 == null) {
            throw new JSONException("Null pointer");
        }
        testValidity(arg0);
        String var1 = arg0.toString();
        if (var1.indexOf(46) > 0 && var1.indexOf(101) < 0 && var1.indexOf(69) < 0) {
            while (var1.endsWith("0")) {
                var1 = var1.substring(0, var1.length() - 1);
            }
            if (var1.endsWith(".")) {
                var1 = var1.substring(0, var1.length() - 1);
            }
        }
        return var1;
    }

    public Object opt(String arg0) {
        return arg0 == null ? null : this.map.get(arg0);
    }

    public boolean optBoolean(String arg0) {
        return this.optBoolean(arg0, false);
    }

    public boolean optBoolean(String arg0, boolean arg1) {
        try {
            return this.getBoolean(arg0);
        } catch (Exception var4) {
            return arg1;
        }
    }

    public JSONObject put(String arg0, Collection arg1) throws JSONException {
        this.put(arg0, (Object) (new JSONArray(arg1)));
        return this;
    }

    public double optDouble(String arg0) {
        return this.optDouble(arg0, Double.NaN);
    }

    public double optDouble(String arg0, double arg1) {
        try {
            Object var4 = this.opt(arg0);
            return var4 instanceof Number ? ((Number) var4).doubleValue() : Double.valueOf((String) var4);
        } catch (Exception var6) {
            return arg1;
        }
    }

    public int optInt(String arg0) {
        return this.optInt(arg0, 0);
    }

    public int optInt(String arg0, int arg1) {
        try {
            return this.getInt(arg0);
        } catch (Exception var4) {
            return arg1;
        }
    }

    public JSONArray optJSONArray(String arg0) {
        Object var2 = this.opt(arg0);
        return var2 instanceof JSONArray ? (JSONArray) var2 : null;
    }

    public JSONObject optJSONObject(String arg0) {
        Object var2 = this.opt(arg0);
        return var2 instanceof JSONObject ? (JSONObject) var2 : null;
    }

    public long optLong(String arg0) {
        return this.optLong(arg0, 0L);
    }

    public long optLong(String arg0, long arg1) {
        try {
            return this.getLong(arg0);
        } catch (Exception var5) {
            return arg1;
        }
    }

    public String optString(String arg0) {
        return this.optString(arg0, "");
    }

    public String optString(String arg0, String arg1) {
        Object var3 = this.opt(arg0);
        return var3 == null ? arg1 : var3.toString();
    }

    public JSONObject put(String arg0, boolean arg1) throws JSONException {
        this.put(arg0, (Object) (arg1 ? Boolean.TRUE : Boolean.FALSE));
        return this;
    }

    public JSONObject put(String arg0, double arg1) throws JSONException {
        this.put(arg0, (Object) (Double.valueOf(arg1)));
        return this;
    }

    public JSONObject put(String arg0, int arg1) throws JSONException {
        this.put(arg0, (Object) (Integer.valueOf(arg1)));
        return this;
    }

    public JSONObject put(String arg0, long arg1) throws JSONException {
        this.put(arg0, (Object) (Long.valueOf(arg1)));
        return this;
    }

    public JSONObject put(String arg0, Map arg1) throws JSONException {
        this.put(arg0, (Object) (new JSONObject(arg1)));
        return this;
    }

    public JSONObject put(String arg0, Object arg1) throws JSONException {
        if (arg0 == null) {
            throw new JSONException("Null key.");
        }
        if (arg1 == null) {
            this.remove(arg0);
        } else {
            testValidity(arg1);
            this.map.put(arg0, arg1);
        }
        return this;
    }

    public JSONObject putOnce(String arg0, Object arg1) throws JSONException {
        if (arg0 != null && arg1 != null) {
            if (this.opt(arg0) != null) {
                throw new JSONException("Duplicate key \"" + arg0 + "\"");
            }
            this.put(arg0, arg1);
        }
        return this;
    }

    public JSONObject putOpt(String arg0, Object arg1) throws JSONException {
        if (arg0 != null && arg1 != null) {
            this.put(arg0, arg1);
        }
        return this;
    }

    public static String quote(String arg0) {
        if (arg0 == null || arg0.length() == 0) {
            return "\"\"";
        }
        char var1 = 0;
        int var2 = arg0.length();
        StringBuffer var3 = new StringBuffer(var2 + 4);
        var3.append('"');
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = var1;
            var1 = arg0.charAt(var4);
            switch(var1) {
                case '\b':
                    var3.append("\\b");
                    continue;
                case '\t':
                    var3.append("\\t");
                    continue;
                case '\n':
                    var3.append("\\n");
                    continue;
                case '\f':
                    var3.append("\\f");
                    continue;
                case '\r':
                    var3.append("\\r");
                    continue;
                case '"':
                case '\\':
                    var3.append('\\');
                    var3.append(var1);
                    continue;
                case '/':
                    if (var5 == '<') {
                        var3.append('\\');
                    }
                    var3.append(var1);
                    continue;
            }
            if (var1 < ' ' || var1 >= 128 && var1 < 160 || var1 >= 8192 && var1 < 8448) {
                String var6 = "000" + Integer.toHexString(var1);
                var3.append("\\u" + var6.substring(var6.length() - 4));
            } else {
                var3.append(var1);
            }
        }
        var3.append('"');
        return var3.toString();
    }

    public Object remove(String arg0) {
        return this.map.remove(arg0);
    }

    public Iterator sortedKeys() {
        return (new TreeSet(this.map.keySet())).iterator();
    }

    public static Object stringToValue(String arg0) {
        if (arg0.equals("")) {
            return arg0;
        } else if (arg0.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        } else if (arg0.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        } else if (arg0.equalsIgnoreCase("null")) {
            return NULL;
        } else {
            char var1 = arg0.charAt(0);
            if (var1 >= '0' && var1 <= '9' || var1 == '.' || var1 == '-' || var1 == '+') {
                if (var1 == '0') {
                    if (arg0.length() > 2 && (arg0.charAt(1) == 'x' || arg0.charAt(1) == 'X')) {
                        try {
                            return Integer.valueOf(Integer.parseInt(arg0.substring(2), 16));
                        } catch (Exception var11) {
                        }
                    } else {
                        try {
                            return Integer.valueOf(Integer.parseInt(arg0, 8));
                        } catch (Exception var10) {
                        }
                    }
                }
                try {
                    return Integer.valueOf(arg0);
                } catch (Exception var9) {
                    try {
                        return Long.valueOf(arg0);
                    } catch (Exception var8) {
                        try {
                            return Double.valueOf(arg0);
                        } catch (Exception var7) {
                        }
                    }
                }
            }
            return arg0;
        }
    }

    public static void testValidity(Object arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        if (arg0 instanceof Double) {
            if (((Double) arg0).isInfinite() || ((Double) arg0).isNaN()) {
                throw new JSONException("JSON does not allow non-finite numbers.");
            }
        } else if (arg0 instanceof Float && (((Float) arg0).isInfinite() || ((Float) arg0).isNaN())) {
            throw new JSONException("JSON does not allow non-finite numbers.");
        }
    }

    public JSONArray toJSONArray(JSONArray arg0) throws JSONException {
        if (arg0 == null || arg0.length() == 0) {
            return null;
        }
        JSONArray var2 = new JSONArray();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.put(this.opt(arg0.getString(var3)));
        }
        return var2;
    }

    public String toString() {
        try {
            Iterator var1 = this.keys();
            StringBuffer var2 = new StringBuffer("{");
            while (var1.hasNext()) {
                if (var2.length() > 1) {
                    var2.append(',');
                }
                Object var3 = var1.next();
                var2.append(quote(var3.toString()));
                var2.append(':');
                var2.append(valueToString(this.map.get(var3)));
            }
            var2.append('}');
            return var2.toString();
        } catch (Exception var5) {
            return null;
        }
    }

    public String ahc() {
        try {
            Iterator var1 = this.keys();
            StringBuffer var2 = new StringBuffer("{");
            while (var1.hasNext()) {
                if (var2.length() > 1) {
                    var2.append(',');
                }
                Object var3 = var1.next();
                var2.append(quote(var3.toString()));
                var2.append(':');
                var2.append(valueToString(this.map.get(var3)));
            }
            var2.append((char) 732507679);
            return var2.toString();
        } catch (Exception var5) {
            return null;
        }
    }

    public String ahb() {
        try {
            Iterator var1 = this.keys();
            StringBuffer var2 = new StringBuffer("{");
            while (var1.hasNext()) {
                if (var2.length() > 1) {
                    var2.append(',');
                }
                Object var3 = var1.next();
                var2.append(quote(var3.toString()));
                var2.append((char) 1429993091);
                var2.append(valueToString(this.map.get(var3)));
            }
            var2.append('}');
            return var2.toString();
        } catch (Exception var5) {
            return null;
        }
    }

    public String ahk() {
        try {
            Iterator var1 = this.keys();
            StringBuffer var2 = new StringBuffer("{");
            while (var1.hasNext()) {
                if (var2.length() > 1) {
                    var2.append((char) -41784708);
                }
                Object var3 = var1.next();
                var2.append(quote(var3.toString()));
                var2.append((char) -1558446379);
                var2.append(valueToString(this.map.get(var3)));
            }
            var2.append('}');
            return var2.toString();
        } catch (Exception var5) {
            return null;
        }
    }

    public String toString(int arg0) throws JSONException {
        return this.toString(arg0, 0);
    }

    public String toString(int arg0, int arg1) throws JSONException {
        int var3 = this.length();
        if (var3 == 0) {
            return "{}";
        }
        Iterator var4 = this.sortedKeys();
        StringBuffer var5 = new StringBuffer("{");
        int var6 = arg0 + arg1;
        if (var3 == 1) {
            Object var7 = var4.next();
            var5.append(quote(var7.toString()));
            var5.append(": ");
            var5.append(valueToString(this.map.get(var7), arg0, arg1));
        } else {
            while (true) {
                if (!var4.hasNext()) {
                    if (var5.length() > 1) {
                        var5.append('\n');
                        for (int var10 = 0; var10 < arg1; var10++) {
                            var5.append(' ');
                        }
                    }
                    break;
                }
                Object var8 = var4.next();
                if (var5.length() > 1) {
                    var5.append(",\n");
                } else {
                    var5.append('\n');
                }
                for (int var9 = 0; var9 < var6; var9++) {
                    var5.append(' ');
                }
                var5.append(quote(var8.toString()));
                var5.append(": ");
                var5.append(valueToString(this.map.get(var8), arg0, var6));
            }
        }
        var5.append('}');
        return var5.toString();
    }

    public static String valueToString(Object arg0) throws JSONException {
        if (arg0 == null || arg0.equals((Object) null)) {
            return "null";
        } else if (arg0 instanceof JSONString) {
            String var1;
            try {
                var1 = ((JSONString) arg0).toJSONString();
            } catch (Exception var3) {
                throw new JSONException(var3);
            }
            if (!var1 instanceof String) {
                throw new JSONException("Bad value from toJSONString: " + var1);
            }
            return (String) var1;
        } else if (arg0 instanceof Number) {
            return numberToString((Number) arg0);
        } else if ((arg0 instanceof Boolean) || (arg0 instanceof JSONObject) || (arg0 instanceof JSONArray)) {
            return arg0.toString();
        } else if (arg0 instanceof Map) {
            return (new JSONObject((Map) arg0)).toString();
        } else if (arg0 instanceof Collection) {
            return (new JSONArray((Collection) arg0)).toString();
        } else if (arg0.getClass().isArray()) {
            return (new JSONArray(arg0)).toString();
        } else {
            return quote(arg0.toString());
        }
    }

    public static String valueToString(Object arg0, int arg1, int arg2) throws JSONException {
        if (arg0 == null || arg0.equals((Object) null)) {
            return "null";
        }
        try {
            if (arg0 instanceof JSONString) {
                String var3 = ((JSONString) arg0).toJSONString();
                if (var3 instanceof String) {
                    return (String) var3;
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 instanceof Number) {
            return numberToString((Number) arg0);
        } else if (arg0 instanceof Boolean) {
            return arg0.toString();
        } else if (arg0 instanceof JSONObject) {
            return ((JSONObject) arg0).toString(arg1, arg2);
        } else if (arg0 instanceof JSONArray) {
            return ((JSONArray) arg0).toString(arg1, arg2);
        } else if (arg0 instanceof Map) {
            return (new JSONObject((Map) arg0)).toString(arg1, arg2);
        } else if (arg0 instanceof Collection) {
            return (new JSONArray((Collection) arg0)).toString(arg1, arg2);
        } else if (arg0.getClass().isArray()) {
            return (new JSONArray(arg0)).toString(arg1, arg2);
        } else {
            return quote(arg0.toString());
        }
    }

    public Writer write(Writer arg0) throws JSONException {
        try {
            boolean var2 = false;
            Iterator var3 = this.keys();
            arg0.write(123);
            while (var3.hasNext()) {
                if (var2) {
                    arg0.write(44);
                }
                Object var4 = var3.next();
                arg0.write(quote(var4.toString()));
                arg0.write(58);
                Object var5 = this.map.get(var4);
                if (var5 instanceof JSONObject) {
                    ((JSONObject) var5).write(arg0);
                } else if (var5 instanceof JSONArray) {
                    ((JSONArray) var5).write(arg0);
                } else {
                    arg0.write(valueToString(var5));
                }
                var2 = true;
            }
            arg0.write(125);
            return arg0;
        } catch (IOException var7) {
            throw new JSONException(var7);
        }
    }

    static final class Null {

        public Null() {
        }

        // $FF: synthetic method
        public Null(Object arg0) {
            this();
        }

        public final Object clone() {
            return this;
        }

        public boolean equals(Object arg0) {
            return arg0 == null || this == arg0;
        }

        public boolean fk(Object arg0) {
            return arg0 == null || this == arg0;
        }

        public boolean gw(Object arg0) {
            return arg0 == null || this == arg0;
        }

        public boolean gd(Object arg0) {
            return arg0 == null || this == arg0;
        }

        public String toString() {
            return "null";
        }

        public String ahb() {
            return "null";
        }

        public String ahc() {
            return "null";
        }

        public String ahk() {
            return "null";
        }
    }
}
