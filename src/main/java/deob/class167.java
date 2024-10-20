package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gy")
public class class167 {

    @ObfuscatedName("gy.at")
    public int field1807 = -1;

    @ObfuscatedName("gy.aa")
    public String field1808;

    @ObfuscatedName("gy.ay")
    public class110 field1803;

    @ObfuscatedName("gy.ao")
    public String field1810 = null;

    @ObfuscatedName("gy.ax")
    public float[] field1811 = new float[4];

    @ObfuscatedName("gy.ai")
    public ArrayList field1812 = new ArrayList();

    @ObfuscatedName("gy.ag")
    public ArrayList field1813 = new ArrayList();

    @ObfuscatedName("gy.ah")
    public ArrayList field1814 = new ArrayList();

    @ObfuscatedName("gy.av")
    public Map field1815 = new HashMap();

    @ObfuscatedName("gy.ar")
    public Map field1800 = new HashMap();

    @ObfuscatedName("gy.af(Ljava/lang/String;Let;I)Z")
    public boolean method3204(String arg0, class108 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3214();
            try {
                this.field1808 = arg0;
                this.field1803 = arg1.method2679(new URL(this.field1808));
                this.field1807 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3214();
                this.field1807 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("gy.an(Let;B)V")
    public void method3205(class108 arg0) {
        switch(this.field1807) {
            case 0:
                this.method3265(arg0);
                break;
            case 1:
                this.method3209();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gy.aw(B)I")
    public int method3206() {
        return this.field1807;
    }

    @ObfuscatedName("gy.ac(Ljava/lang/String;B)I")
    public int method3216(String arg0) {
        return this.field1815.containsKey(arg0) ? (Integer) this.field1815.get(arg0) : -1;
    }

    @ObfuscatedName("gy.au(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3208(String arg0) {
        return (String) ((String) (this.field1800.containsKey(arg0) ? this.field1800.get(arg0) : null));
    }

    @ObfuscatedName("gy.ab(I)Ljava/util/ArrayList;")
    public ArrayList method3211() {
        return this.field1813;
    }

    @ObfuscatedName("gy.aq(B)Ljava/util/ArrayList;")
    public ArrayList method3264() {
        return this.field1814;
    }

    @ObfuscatedName("gy.al(B)Ljava/lang/String;")
    public String method3247() {
        return this.field1810;
    }

    @ObfuscatedName("gy.at(I)[F")
    public float[] method3212() {
        return this.field1811;
    }

    @ObfuscatedName("gy.aa(I)Ljava/util/ArrayList;")
    public ArrayList method3213() {
        return this.field1812;
    }

    @ObfuscatedName("gy.ay(I)V")
    public void method3214() {
        this.field1803 = null;
        this.field1810 = null;
        this.field1811[0] = 0.0F;
        this.field1811[1] = 0.0F;
        this.field1811[2] = 1.0F;
        this.field1811[3] = 1.0F;
        this.field1812.clear();
        this.field1813.clear();
        this.field1814.clear();
        this.field1815.clear();
        this.field1800.clear();
    }

    @ObfuscatedName("gy.ao(Let;I)V")
    public void method3265(class108 arg0) {
        if (this.field1803 == null || !this.field1803.method2708()) {
            return;
        }
        byte[] var2 = this.field1803.method2710();
        if (var2 == null) {
            this.method3214();
            this.field1807 = 100;
            return;
        }
        try {
            this.method3221(new class438(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3214();
            this.field1807 = 102;
            return;
        }
        this.field1807 = this.field1813.size() > 0 ? 1 : 2;
        this.field1803 = null;
    }

    @ObfuscatedName("gy.ax(I)V")
    public void method3209() {
        Iterator var1 = this.field1813.iterator();
        class173 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1813.iterator();
                while (var3.hasNext()) {
                    class173 var4 = (class173) var3.next();
                    if (var4.field1850 != null) {
                        byte[] var5 = var4.field1850.method2710();
                        if (var5 != null && var5.length > 0) {
                            this.field1807 = 2;
                            return;
                        }
                    }
                }
                this.method3214();
                this.field1807 = 101;
                return;
            }
            var2 = (class173) var1.next();
        } while (var2.field1850 == null || var2.field1850.method2708());
    }

    @ObfuscatedName("gy.ai(Lorg/json/JSONArray;Let;I)V")
    public void method3217(JSONArray arg0, class108 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class173 var5 = new class173(this);
                var5.field1850 = arg1.method2679(new URL(var4.getString("src")));
                var5.field1849 = method2738(var4, "placement");
                this.field1813.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("gy.ag(Lorg/json/JSONArray;B)V")
    public void method3218(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class174 var4 = new class174(this);
            var4.field1856 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1859 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1860 = var10;
            var4.field1854 = var3.getInt("font");
            var4.field1857 = method2738(var3, "placement");
            this.field1814.add(var4);
        }
    }

    @ObfuscatedName("gy.ah(Lorg/json/JSONObject;I)V")
    public void method3219(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1811 = method2738(arg0, "clickbounds");
        this.field1810 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1812.add(new class175(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1812.add(new class175(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1812.add(new class175(this, var2[var3], 0));
                        } else {
                            this.field1812.add(new class166(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("gy.av(Lorg/json/JSONObject;I)V")
    public void method3248(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1815.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1815.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1815.put(var2[var3], 0);
                    } else {
                        this.field1800.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("gy.ar(Lqv;Let;I)V")
    public void method3221(class438 arg0, class108 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7608();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3214();
            this.field1807 = 102;
            return;
        }
        try {
            this.method3217(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field1813.clear();
        }
        try {
            this.method3218(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field1814.clear();
        }
        try {
            this.method3219(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field1810 = null;
            this.field1811[0] = 0.0F;
            this.field1811[1] = 0.0F;
            this.field1811[2] = 1.0F;
            this.field1811[3] = 1.0F;
            this.field1812.clear();
        }
        try {
            this.method3248(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field1815.clear();
            this.field1800.clear();
        }
    }

    @ObfuscatedName("gy.am(Ljava/lang/String;Let;I)Z")
    public boolean method3222(String arg0, class108 arg1) {
        try {
            this.method3221(new class438(arg0.getBytes()), arg1);
            this.field1807 = this.field1813.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field1807 = 102;
        }
        return this.field1807 < 100;
    }

    @ObfuscatedName("ea.as(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method2738(JSONObject arg0, String arg1) throws JSONException {
        float[] var2 = new float[4];
        try {
            JSONArray var3 = arg0.getJSONArray(arg1);
            var2[0] = (float) var3.optDouble(0, 0.0D);
            var2[1] = (float) var3.optDouble(1, 0.0D);
            var2[2] = (float) var3.optDouble(2, 1.0D);
            var2[3] = (float) var3.optDouble(3, 1.0D);
        } catch (JSONException var5) {
            var2[0] = 0.0F;
            var2[1] = 0.0F;
            var2[2] = 1.0F;
            var2[3] = 1.0F;
        }
        return var2;
    }
}
