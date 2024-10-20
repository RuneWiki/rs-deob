package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hq")
public class class183 {

    @ObfuscatedName("hq.ah")
    public String field1929;

    @ObfuscatedName("hq.af")
    public int field1930 = 0;

    @ObfuscatedName("hq.at")
    public ArrayList field1935 = new ArrayList();

    @ObfuscatedName("hq.an")
    public ArrayList field1932 = new ArrayList();

    @ObfuscatedName("hq.ao")
    public ArrayList field1931 = new ArrayList();

    @ObfuscatedName("hq.ab")
    public String field1933 = null;

    @ObfuscatedName("hq.aw")
    public float[] field1928 = new float[4];

    @ObfuscatedName("hq.ad")
    public Map field1936 = new HashMap();

    @ObfuscatedName("hq.al")
    public Map field1937 = new HashMap();

    @ObfuscatedName("hq.az(I)Ljava/lang/String;")
    public String method3293() {
        return this.field1929;
    }

    @ObfuscatedName("hq.ah(I)I")
    public int method3294() {
        return this.field1930;
    }

    @ObfuscatedName("hq.af(I)V")
    public void method3297() {
        this.field1933 = null;
        this.field1928[0] = 0.0F;
        this.field1928[1] = 0.0F;
        this.field1928[2] = 1.0F;
        this.field1928[3] = 1.0F;
        this.field1935.clear();
        this.field1932.clear();
        this.field1931.clear();
        this.field1936.clear();
        this.field1937.clear();
    }

    @ObfuscatedName("hq.at(Lorg/json/JSONObject;ILea;S)Z")
    public boolean method3328(JSONObject arg0, int arg1, class114 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method3297();
                return false;
            }
            try {
                this.method3330(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field1932.clear();
            }
            try {
                this.method3299(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field1931.clear();
            }
        } else {
            try {
                this.method3298(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field1932.clear();
            }
            try {
                this.method3306(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field1931.clear();
            }
        }
        try {
            this.method3318(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field1933 = null;
            this.field1928[0] = 0.0F;
            this.field1928[1] = 0.0F;
            this.field1928[2] = 1.0F;
            this.field1928[3] = 1.0F;
            this.field1935.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method3301(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field1936.clear();
            this.field1937.clear();
        }
        if (arg1 == 2) {
            try {
                this.field1929 = var4.getString("id");
                this.field1930 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("hq.an(Lorg/json/JSONArray;Lea;B)V")
    public void method3330(JSONArray arg0, class114 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class173 var5 = new class173(this);
                var5.field1860 = arg1.method2677(new URL(var4.getString("src")));
                var5.field1858 = method2984(var4, "placement");
                this.field1932.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("hq.ao(Lorg/json/JSONObject;Lea;I)V")
    public void method3298(JSONObject arg0, class114 arg1) throws JSONException {
        try {
            class173 var3 = new class173(this);
            var3.field1860 = arg1.method2677(new URL(arg0.getString("src")));
            var3.field1858 = method2984(arg0, "placement");
            this.field1932.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("hq.ab(Lorg/json/JSONArray;I)V")
    public void method3299(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class184 var4 = new class184(this);
            var4.field1941 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1942 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1943 = var10;
            var4.field1944 = var3.getInt("font");
            var4.field1939 = method2984(var3, "placement");
            this.field1931.add(var4);
        }
    }

    @ObfuscatedName("hq.aw(Lorg/json/JSONObject;I)V")
    public void method3306(JSONObject arg0) throws JSONException {
        class184 var2 = new class184(this);
        var2.field1941 = arg0.optString("text");
        String var4 = arg0.optString("align_x");
        byte var5;
        if (var4.equals("centre")) {
            var5 = 1;
        } else if (var4.equals("bottom") || var4.equals("right")) {
            var5 = 2;
        } else {
            var5 = 0;
        }
        var2.field1942 = var5;
        String var7 = arg0.optString("align_y");
        byte var8;
        if (var7.equals("centre")) {
            var8 = 1;
        } else if (var7.equals("bottom") || var7.equals("right")) {
            var8 = 2;
        } else {
            var8 = 0;
        }
        var2.field1943 = var8;
        var2.field1944 = arg0.optInt("font");
        var2.field1939 = method2984(arg0, "placement");
        this.field1931.add(var2);
    }

    @ObfuscatedName("hq.ad(Lorg/json/JSONObject;I)V")
    public void method3318(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1928 = method2984(arg0, "clickbounds");
        this.field1933 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1935.add(new class171(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1935.add(new class171(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1935.add(new class171(this, var2[var3], 0));
                        } else {
                            this.field1935.add(new class180(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("hq.al(Lorg/json/JSONObject;B)V")
    public void method3301(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field1936.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1936.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1936.put(var2[var3], 0);
                    } else {
                        this.field1937.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("fq.as(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method2984(JSONObject arg0, String arg1) throws JSONException {
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
