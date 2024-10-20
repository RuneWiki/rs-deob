package org.json;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class JSONArray {

    public ArrayList myArrayList;

    public JSONArray() {
        this.myArrayList = new ArrayList();
    }

    public JSONArray(JSONTokener arg0) throws JSONException {
        this();
        char var2 = arg0.nextClean();
        char var3;
        if (var2 == '[') {
            var3 = ']';
        } else if (var2 == '(') {
            var3 = ')';
        } else {
            throw arg0.syntaxError("A JSONArray text must start with '['");
        }
        if (arg0.nextClean() != ']') {
            arg0.back();
            while (true) {
                if (arg0.nextClean() == ',') {
                    arg0.back();
                    this.myArrayList.add((Object) null);
                } else {
                    arg0.back();
                    this.myArrayList.add(arg0.nextValue());
                }
                char var4 = arg0.nextClean();
                switch(var4) {
                    case ')':
                    case ']':
                        if (var3 != var4) {
                            throw arg0.syntaxError("Expected a '" + Character.valueOf(var3) + "'");
                        }
                        return;
                    case ',':
                    case ';':
                        if (arg0.nextClean() == ']') {
                            return;
                        }
                        arg0.back();
                        break;
                    default:
                        throw arg0.syntaxError("Expected a ',' or ']'");
                }
            }
        }
    }

    public JSONArray(String arg0) throws JSONException {
        this(new JSONTokener(arg0));
    }

    public JSONArray(Collection arg0) {
        this.myArrayList = arg0 == null ? new ArrayList() : new ArrayList(arg0);
    }

    public JSONArray(Collection arg0, boolean arg1) {
        this.myArrayList = new ArrayList();
        if (arg0 != null) {
            Iterator var3 = arg0.iterator();
            while (var3.hasNext()) {
                this.myArrayList.add(new JSONObject(var3.next(), arg1));
            }
        }
    }

    public JSONArray(Object arg0) throws JSONException {
        this();
        if (!arg0.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int var2 = Array.getLength(arg0);
        for (int var3 = 0; var3 < var2; var3++) {
            this.put(Array.get(arg0, var3));
        }
    }

    public JSONArray(Object arg0, boolean arg1) throws JSONException {
        this();
        if (!arg0.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int var3 = Array.getLength(arg0);
        for (int var4 = 0; var4 < var3; var4++) {
            this.put((Object) (new JSONObject(Array.get(arg0, var4), arg1)));
        }
    }

    public Object get(int arg0) throws JSONException {
        Object var2 = this.opt(arg0);
        if (var2 == null) {
            throw new JSONException("JSONArray[" + arg0 + "] not found.");
        }
        return var2;
    }

    public boolean getBoolean(int arg0) throws JSONException {
        Object var2 = this.get(arg0);
        if (var2.equals(Boolean.FALSE) || var2 instanceof String && ((String) var2).equalsIgnoreCase("false")) {
            return false;
        } else if (var2.equals(Boolean.TRUE) || var2 instanceof String && ((String) var2).equalsIgnoreCase("true")) {
            return true;
        } else {
            throw new JSONException("JSONArray[" + arg0 + "] is not a Boolean.");
        }
    }

    public double getDouble(int arg0) throws JSONException {
        Object var2 = this.get(arg0);
        try {
            return var2 instanceof Number ? ((Number) var2).doubleValue() : Double.valueOf((String) var2);
        } catch (Exception var4) {
            throw new JSONException("JSONArray[" + arg0 + "] is not a number.");
        }
    }

    public int getInt(int arg0) throws JSONException {
        Object var2 = this.get(arg0);
        return var2 instanceof Number ? ((Number) var2).intValue() : (int) this.getDouble(arg0);
    }

    public JSONArray getJSONArray(int arg0) throws JSONException {
        Object var2 = this.get(arg0);
        if (!var2 instanceof JSONArray) {
            throw new JSONException("JSONArray[" + arg0 + "] is not a JSONArray.");
        }
        return (JSONArray) var2;
    }

    public JSONObject getJSONObject(int arg0) throws JSONException {
        Object var2 = this.get(arg0);
        if (!var2 instanceof JSONObject) {
            throw new JSONException("JSONArray[" + arg0 + "] is not a JSONObject.");
        }
        return (JSONObject) var2;
    }

    public long getLong(int arg0) throws JSONException {
        Object var2 = this.get(arg0);
        return var2 instanceof Number ? ((Number) var2).longValue() : (long) this.getDouble(arg0);
    }

    public String getString(int arg0) throws JSONException {
        return this.get(arg0).toString();
    }

    public boolean isNull(int arg0) {
        return JSONObject.NULL.equals(this.opt(arg0));
    }

    public String join(String arg0) throws JSONException {
        int var2 = this.length();
        StringBuffer var3 = new StringBuffer();
        for (int var4 = 0; var4 < var2; var4++) {
            if (var4 > 0) {
                var3.append(arg0);
            }
            var3.append(JSONObject.valueToString(this.myArrayList.get(var4)));
        }
        return var3.toString();
    }

    public int length() {
        return this.myArrayList.size();
    }

    public Object opt(int arg0) {
        return arg0 >= 0 && arg0 < this.length() ? this.myArrayList.get(arg0) : null;
    }

    public boolean optBoolean(int arg0) {
        return this.optBoolean(arg0, false);
    }

    public boolean optBoolean(int arg0, boolean arg1) {
        try {
            return this.getBoolean(arg0);
        } catch (Exception var4) {
            return arg1;
        }
    }

    public double optDouble(int arg0) {
        return this.optDouble(arg0, Double.NaN);
    }

    public double optDouble(int arg0, double arg1) {
        try {
            return this.getDouble(arg0);
        } catch (Exception var5) {
            return arg1;
        }
    }

    public int optInt(int arg0) {
        return this.optInt(arg0, 0);
    }

    public int optInt(int arg0, int arg1) {
        try {
            return this.getInt(arg0);
        } catch (Exception var4) {
            return arg1;
        }
    }

    public JSONArray optJSONArray(int arg0) {
        Object var2 = this.opt(arg0);
        return var2 instanceof JSONArray ? (JSONArray) var2 : null;
    }

    public JSONObject optJSONObject(int arg0) {
        Object var2 = this.opt(arg0);
        return var2 instanceof JSONObject ? (JSONObject) var2 : null;
    }

    public long optLong(int arg0) {
        return this.optLong(arg0, 0L);
    }

    public long optLong(int arg0, long arg1) {
        try {
            return this.getLong(arg0);
        } catch (Exception var5) {
            return arg1;
        }
    }

    public String optString(int arg0) {
        return this.optString(arg0, "");
    }

    public String optString(int arg0, String arg1) {
        Object var3 = this.opt(arg0);
        return var3 == null ? arg1 : var3.toString();
    }

    public JSONArray put(boolean arg0) {
        this.put((Object) (arg0 ? Boolean.TRUE : Boolean.FALSE));
        return this;
    }

    public JSONArray put(Collection arg0) {
        this.put((Object) (new JSONArray(arg0)));
        return this;
    }

    public JSONArray put(double arg0) throws JSONException {
        Double var3 = Double.valueOf(arg0);
        JSONObject.testValidity(var3);
        this.put((Object) var3);
        return this;
    }

    public JSONArray put(int arg0) {
        this.put((Object) (Integer.valueOf(arg0)));
        return this;
    }

    public JSONArray put(long arg0) {
        this.put((Object) (Long.valueOf(arg0)));
        return this;
    }

    public JSONArray put(Map arg0) {
        this.put((Object) (new JSONObject(arg0)));
        return this;
    }

    public JSONArray put(Object arg0) {
        this.myArrayList.add(arg0);
        return this;
    }

    public JSONArray put(int arg0, boolean arg1) throws JSONException {
        this.put(arg0, (Object) (arg1 ? Boolean.TRUE : Boolean.FALSE));
        return this;
    }

    public JSONArray put(int arg0, Collection arg1) throws JSONException {
        this.put(arg0, (Object) (new JSONArray(arg1)));
        return this;
    }

    public JSONArray put(int arg0, double arg1) throws JSONException {
        this.put(arg0, (Object) (Double.valueOf(arg1)));
        return this;
    }

    public JSONArray put(int arg0, int arg1) throws JSONException {
        this.put(arg0, (Object) (Integer.valueOf(arg1)));
        return this;
    }

    public JSONArray put(int arg0, long arg1) throws JSONException {
        this.put(arg0, (Object) (Long.valueOf(arg1)));
        return this;
    }

    public JSONArray put(int arg0, Map arg1) throws JSONException {
        this.put(arg0, (Object) (new JSONObject(arg1)));
        return this;
    }

    public JSONArray put(int arg0, Object arg1) throws JSONException {
        JSONObject.testValidity(arg1);
        if (arg0 < 0) {
            throw new JSONException("JSONArray[" + arg0 + "] not found.");
        }
        if (arg0 < this.length()) {
            this.myArrayList.set(arg0, arg1);
        } else {
            while (arg0 != this.length()) {
                this.put(JSONObject.NULL);
            }
            this.put(arg1);
        }
        return this;
    }

    public JSONObject toJSONObject(JSONArray arg0) throws JSONException {
        if (arg0 == null || arg0.length() == 0 || this.length() == 0) {
            return null;
        }
        JSONObject var2 = new JSONObject();
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            var2.put(arg0.getString(var3), this.opt(var3));
        }
        return var2;
    }

    public String agt() {
        try {
            return '[' + this.join(",") + ']';
        } catch (Exception var2) {
            return null;
        }
    }

    public String toString() {
        try {
            return '[' + this.join(",") + ']';
        } catch (Exception var2) {
            return null;
        }
    }

    public String ags() {
        try {
            return '[' + this.join(",") + ']';
        } catch (Exception var2) {
            return null;
        }
    }

    public String agx() {
        try {
            return 744718321 + this.join(",") + -811162798;
        } catch (Exception var2) {
            return null;
        }
    }

    public String agv() {
        try {
            return '[' + this.join(",") + ']';
        } catch (Exception var2) {
            return null;
        }
    }

    public String toString(int arg0) throws JSONException {
        return this.toString(arg0, 0);
    }

    public String toString(int arg0, int arg1) throws JSONException {
        int var3 = this.length();
        if (var3 == 0) {
            return "[]";
        }
        StringBuffer var4 = new StringBuffer("[");
        if (var3 == 1) {
            var4.append(JSONObject.valueToString(this.myArrayList.get(0), arg0, arg1));
        } else {
            int var5 = arg0 + arg1;
            var4.append('\n');
            for (int var6 = 0; var6 < var3; var6++) {
                if (var6 > 0) {
                    var4.append(",\n");
                }
                for (int var7 = 0; var7 < var5; var7++) {
                    var4.append(' ');
                }
                var4.append(JSONObject.valueToString(this.myArrayList.get(var6), arg0, var5));
            }
            var4.append('\n');
            for (int var8 = 0; var8 < arg1; var8++) {
                var4.append(' ');
            }
        }
        var4.append(']');
        return var4.toString();
    }

    public Writer write(Writer arg0) throws JSONException {
        try {
            boolean var2 = false;
            int var3 = this.length();
            arg0.write(91);
            for (int var4 = 0; var4 < var3; var4++) {
                if (var2) {
                    arg0.write(44);
                }
                Object var5 = this.myArrayList.get(var4);
                if (var5 instanceof JSONObject) {
                    ((JSONObject) var5).write(arg0);
                } else if (var5 instanceof JSONArray) {
                    ((JSONArray) var5).write(arg0);
                } else {
                    arg0.write(JSONObject.valueToString(var5));
                }
                var2 = true;
            }
            arg0.write(93);
            return arg0;
        } catch (IOException var7) {
            throw new JSONException(var7);
        }
    }
}
