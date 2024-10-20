package org.json;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Map.Entry;

public class JSONObject {

    public static final Object NULL = new JSONObject.Null();

    public final Map map;

    public JSONObject() {
        this.map = new HashMap();
    }

    public JSONObject(JSONObject arg0, String[] arg1) {
        this();
        for (int var3 = 0; var3 < arg1.length; var3++) {
            try {
                this.putOnce(arg1[var3], arg0.opt(arg1[var3]));
            } catch (Exception var5) {
            }
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
                    if (var4 != ':') {
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
        this.map = new HashMap();
        if (arg0 != null) {
            Iterator var2 = arg0.entrySet().iterator();
            while (var2.hasNext()) {
                Entry var3 = (Entry) var2.next();
                Object var4 = var3.getValue();
                if (var4 != null) {
                    this.map.put(var3.getKey(), wrap(var4));
                }
            }
        }
    }

    public JSONObject(Object arg0) {
        this();
        this.populateMap(arg0);
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

    public JSONObject(String arg0, Locale arg1) throws JSONException {
        this();
        ResourceBundle var3 = ResourceBundle.getBundle(arg0, arg1, Thread.currentThread().getContextClassLoader());
        Enumeration var4 = var3.getKeys();
        while (true) {
            Object var5;
            do {
                if (!var4.hasMoreElements()) {
                    return;
                }
                var5 = var4.nextElement();
            } while (!(var5 instanceof String));
            String[] var6 = ((String) var5).split("\\.");
            int var7 = var6.length - 1;
            JSONObject var8 = this;
            for (int var9 = 0; var9 < var7; var9++) {
                String var10 = var6[var9];
                JSONObject var11 = var8.optJSONObject(var10);
                if (var11 == null) {
                    var11 = new JSONObject();
                    var8.put(var10, (Object) var11);
                }
                var8 = var11;
            }
            var8.put(var6[var7], (Object) var3.getString((String) var5));
        }
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
        if (arg0 == null) {
            throw new JSONException("Null key.");
        }
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
            return var2 instanceof Number ? ((Number) var2).doubleValue() : Double.parseDouble((String) var2);
        } catch (Exception var4) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not a number.");
        }
    }

    public int getInt(String arg0) throws JSONException {
        Object var2 = this.get(arg0);
        try {
            return var2 instanceof Number ? ((Number) var2).intValue() : Integer.parseInt((String) var2);
        } catch (Exception var4) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not an int.");
        }
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
        try {
            return var2 instanceof Number ? ((Number) var2).longValue() : Long.parseLong((String) var2);
        } catch (Exception var4) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] is not a long.");
        }
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
        Object var2 = this.get(arg0);
        if (!var2 instanceof String) {
            throw new JSONException("JSONObject[" + quote(arg0) + "] not a string.");
        }
        return (String) var2;
    }

    public boolean has(String arg0) {
        return this.map.containsKey(arg0);
    }

    public JSONObject increment(String arg0) throws JSONException {
        Object var2 = this.opt(arg0);
        if (var2 == null) {
            this.put(arg0, 1);
        } else if (var2 instanceof Integer) {
            this.put(arg0, (Integer) var2 + 1);
        } else if (var2 instanceof Long) {
            this.put(arg0, (Long) var2 + 1L);
        } else if (var2 instanceof Double) {
            this.put(arg0, (Double) var2 + 1.0D);
        } else if ((var2 instanceof Float)) {
            this.put(arg0, (double) ((Float) var2 + 1.0F));
        } else {
            throw new JSONException("Unable to increment [" + quote(arg0) + "].");
        }
        return this;
    }

    public boolean isNull(String arg0) {
        return NULL.equals(this.opt(arg0));
    }

    public Iterator keys() {
        return this.keySet().iterator();
    }

    public Set keySet() {
        return this.map.keySet();
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

    public double optDouble(String arg0) {
        return this.optDouble(arg0, Double.NaN);
    }

    public double optDouble(String arg0, double arg1) {
        try {
            return this.getDouble(arg0);
        } catch (Exception var5) {
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
        return NULL.equals(var3) ? arg1 : var3.toString();
    }

    public void populateMap(Object arg0) {
        Class var2 = arg0.getClass();
        boolean var3 = var2.getClassLoader() != null;
        Method[] var4 = var3 ? var2.getMethods() : var2.getDeclaredMethods();
        for (int var5 = 0; var5 < var4.length; var5++) {
            try {
                Method var6 = var4[var5];
                if (Modifier.isPublic(var6.getModifiers())) {
                    String var7 = var6.getName();
                    String var8 = "";
                    if (var7.startsWith("get")) {
                        if ("getClass".equals(var7) || "getDeclaringClass".equals(var7)) {
                            var8 = "";
                        } else {
                            var8 = var7.substring(3);
                        }
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
                        if (var9 != null) {
                            this.map.put(var8, wrap(var9));
                        }
                    }
                }
            } catch (Exception var11) {
            }
        }
    }

    public JSONObject put(String arg0, boolean arg1) throws JSONException {
        this.put(arg0, (Object) (arg1 ? Boolean.TRUE : Boolean.FALSE));
        return this;
    }

    public JSONObject put(String arg0, Collection arg1) throws JSONException {
        this.put(arg0, (Object) (new JSONArray(arg1)));
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
            throw new NullPointerException("Null key.");
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
        StringWriter var1 = new StringWriter();
        synchronized (var1.getBuffer()) {
            String var10000;
            try {
                var10000 = quote(arg0, var1).toString();
            } catch (IOException var5) {
                return "";
            }
            return var10000;
        }
    }

    public static Writer quote(String arg0, Writer arg1) throws IOException {
        if (arg0 == null || arg0.length() == 0) {
            arg1.write("\"\"");
            return arg1;
        }
        char var2 = 0;
        int var3 = arg0.length();
        arg1.write(34);
        for (int var4 = 0; var4 < var3; var4++) {
            char var5 = var2;
            var2 = arg0.charAt(var4);
            switch(var2) {
                case '\b':
                    arg1.write("\\b");
                    continue;
                case '\t':
                    arg1.write("\\t");
                    continue;
                case '\n':
                    arg1.write("\\n");
                    continue;
                case '\f':
                    arg1.write("\\f");
                    continue;
                case '\r':
                    arg1.write("\\r");
                    continue;
                case '"':
                case '\\':
                    arg1.write(92);
                    arg1.write(var2);
                    continue;
                case '/':
                    if (var5 == '<') {
                        arg1.write(92);
                    }
                    arg1.write(var2);
                    continue;
            }
            if (var2 < ' ' || var2 >= 128 && var2 < 160 || var2 >= 8192 && var2 < 8448) {
                arg1.write("\\u");
                String var6 = Integer.toHexString(var2);
                arg1.write("0000", 0, 4 - var6.length());
                arg1.write(var6);
            } else {
                arg1.write(var2);
            }
        }
        arg1.write(34);
        return arg1;
    }

    public Object remove(String arg0) {
        return this.map.remove(arg0);
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
            if (var1 >= '0' && var1 <= '9' || var1 == '-') {
                try {
                    if (arg0.indexOf(46) <= -1 && arg0.indexOf(101) <= -1 && arg0.indexOf(69) <= -1) {
                        Long var3 = Long.valueOf(arg0);
                        if (arg0.equals(var3.toString())) {
                            if (var3 == (long) var3.intValue()) {
                                return Integer.valueOf(var3.intValue());
                            }
                            return var3;
                        }
                    } else {
                        Double var2 = Double.valueOf(arg0);
                        if (!var2.isInfinite() && !var2.isNaN()) {
                            return var2;
                        }
                    }
                } catch (Exception var5) {
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

    public String adb() {
        try {
            return this.toString(0);
        } catch (Exception var2) {
            return null;
        }
    }

    public String ado() {
        try {
            return this.toString(0);
        } catch (Exception var2) {
            return null;
        }
    }

    public String toString() {
        try {
            return this.toString(0);
        } catch (Exception var2) {
            return null;
        }
    }

    public String toString(int arg0) throws JSONException {
        StringWriter var2 = new StringWriter();
        synchronized (var2.getBuffer()) {
            return this.write(var2, arg0, 0).toString();
        }
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

    public static Object wrap(Object arg0) {
        try {
            if (arg0 == null) {
                return NULL;
            } else if ((arg0 instanceof JSONObject) || (arg0 instanceof JSONArray) || NULL.equals(arg0) || (arg0 instanceof JSONString) || (arg0 instanceof Byte) || (arg0 instanceof Character) || (arg0 instanceof Short) || (arg0 instanceof Integer) || (arg0 instanceof Long) || (arg0 instanceof Boolean) || (arg0 instanceof Float) || (arg0 instanceof Double) || (arg0 instanceof String)) {
                return arg0;
            } else if (arg0 instanceof Collection) {
                return new JSONArray((Collection) arg0);
            } else if (arg0.getClass().isArray()) {
                return new JSONArray(arg0);
            } else if (arg0 instanceof Map) {
                return new JSONObject((Map) arg0);
            } else {
                Package var1 = arg0.getClass().getPackage();
                String var2 = var1 == null ? "" : var1.getName();
                return var2.startsWith("java.") || var2.startsWith("javax.") || arg0.getClass().getClassLoader() == null ? arg0.toString() : new JSONObject(arg0);
            }
        } catch (Exception var4) {
            return null;
        }
    }

    public Writer write(Writer arg0) throws JSONException {
        return this.write(arg0, 0, 0);
    }

    public static final Writer writeValue(Writer arg0, Object arg1, int arg2, int arg3) throws JSONException, IOException {
        if (arg1 == null || arg1.equals((Object) null)) {
            arg0.write("null");
        } else if (arg1 instanceof JSONObject) {
            ((JSONObject) arg1).write(arg0, arg2, arg3);
        } else if (arg1 instanceof JSONArray) {
            ((JSONArray) arg1).write(arg0, arg2, arg3);
        } else if (arg1 instanceof Map) {
            (new JSONObject((Map) arg1)).write(arg0, arg2, arg3);
        } else if (arg1 instanceof Collection) {
            (new JSONArray((Collection) arg1)).write(arg0, arg2, arg3);
        } else if (arg1.getClass().isArray()) {
            (new JSONArray(arg1)).write(arg0, arg2, arg3);
        } else if (arg1 instanceof Number) {
            arg0.write(numberToString((Number) arg1));
        } else if (arg1 instanceof Boolean) {
            arg0.write(arg1.toString());
        } else if (arg1 instanceof JSONString) {
            String var4;
            try {
                var4 = ((JSONString) arg1).toJSONString();
            } catch (Exception var6) {
                throw new JSONException(var6);
            }
            arg0.write(var4 == null ? quote(arg1.toString()) : var4.toString());
        } else {
            quote(arg1.toString(), arg0);
        }
        return arg0;
    }

    public static final void indent(Writer arg0, int arg1) throws IOException {
        for (int var2 = 0; var2 < arg1; var2++) {
            arg0.write(32);
        }
    }

    public Writer write(Writer arg0, int arg1, int arg2) throws JSONException {
        try {
            boolean var4 = false;
            int var5 = this.length();
            Iterator var6 = this.keys();
            arg0.write(123);
            if (var5 == 1) {
                Object var7 = var6.next();
                arg0.write(quote(var7.toString()));
                arg0.write(58);
                if (arg1 > 0) {
                    arg0.write(32);
                }
                writeValue(arg0, this.map.get(var7), arg1, arg2);
            } else if (var5 != 0) {
                int var8 = arg1 + arg2;
                while (var6.hasNext()) {
                    Object var9 = var6.next();
                    if (var4) {
                        arg0.write(44);
                    }
                    if (arg1 > 0) {
                        arg0.write(10);
                    }
                    indent(arg0, var8);
                    arg0.write(quote(var9.toString()));
                    arg0.write(58);
                    if (arg1 > 0) {
                        arg0.write(32);
                    }
                    writeValue(arg0, this.map.get(var9), arg1, var8);
                    var4 = true;
                }
                if (arg1 > 0) {
                    arg0.write(10);
                }
                indent(arg0, arg2);
            }
            arg0.write(125);
            return arg0;
        } catch (IOException var11) {
            throw new JSONException(var11);
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

        public boolean bf(Object arg0) {
            return arg0 == null || this == arg0;
        }

        public boolean bh(Object arg0) {
            return arg0 == null || this == arg0;
        }

        public String adb() {
            return "null";
        }

        public String toString() {
            return "null";
        }

        public String ado() {
            return "null";
        }
    }
}
