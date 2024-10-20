package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ih")
public class class220 {

    @ObfuscatedName("ih.ap")
    public String field2352;

    @ObfuscatedName("ih.af")
    public int field2353 = 0;

    @ObfuscatedName("ih.aj")
    public ArrayList field2354 = new ArrayList();

    @ObfuscatedName("ih.aq")
    public ArrayList field2355 = new ArrayList();

    @ObfuscatedName("ih.ar")
    public ArrayList field2358 = new ArrayList();

    @ObfuscatedName("ih.ag")
    public String field2357 = null;

    @ObfuscatedName("ih.ao")
    public float[] field2359 = new float[4];

    @ObfuscatedName("ih.ae")
    public Map field2356 = new HashMap();

    @ObfuscatedName("ih.aa")
    public Map field2360 = new HashMap();

    @ObfuscatedName("ih.am(I)Ljava/lang/String;")
    public String method3978() {
        return this.field2352;
    }

    @ObfuscatedName("ih.ap(B)I")
    public int method3979() {
        return this.field2353;
    }

    @ObfuscatedName("ih.af(B)V")
    public void method4008() {
        this.field2357 = null;
        this.field2359[0] = 0.0F;
        this.field2359[1] = 0.0F;
        this.field2359[2] = 1.0F;
        this.field2359[3] = 1.0F;
        this.field2354.clear();
        this.field2355.clear();
        this.field2358.clear();
        this.field2356.clear();
        this.field2360.clear();
    }

    @ObfuscatedName("ih.aj(Lorg/json/JSONObject;ILeg;I)Z")
    public boolean method3981(JSONObject arg0, int arg1, class113 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method4008();
                return false;
            }
            try {
                this.method3982(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field2355.clear();
            }
            try {
                this.method3984(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field2358.clear();
            }
        } else {
            try {
                this.method4006(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field2355.clear();
            }
            try {
                this.method3985(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field2358.clear();
            }
        }
        try {
            this.method3992(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field2357 = null;
            this.field2359[0] = 0.0F;
            this.field2359[1] = 0.0F;
            this.field2359[2] = 1.0F;
            this.field2359[3] = 1.0F;
            this.field2354.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method3987(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field2356.clear();
            this.field2360.clear();
        }
        if (arg1 == 2) {
            try {
                this.field2352 = var4.getString("id");
                this.field2353 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("ih.aq(Lorg/json/JSONArray;Leg;I)V")
    public void method3982(JSONArray arg0, class113 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class210 var5 = new class210(this);
                var5.field2285 = arg1.method2760(new URL(var4.getString("src")));
                var5.field2283 = method5278(var4, "placement");
                this.field2355.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("ih.ar(Lorg/json/JSONObject;Leg;I)V")
    public void method4006(JSONObject arg0, class113 arg1) throws JSONException {
        try {
            class210 var3 = new class210(this);
            var3.field2285 = arg1.method2760(new URL(arg0.getString("src")));
            var3.field2283 = method5278(arg0, "placement");
            this.field2355.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("ih.ag(Lorg/json/JSONArray;I)V")
    public void method3984(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class221 var4 = new class221(this);
            var4.field2364 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field2370 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field2367 = var10;
            var4.field2369 = var3.getInt("font");
            var4.field2365 = method5278(var3, "placement");
            this.field2358.add(var4);
        }
    }

    @ObfuscatedName("ih.ao(Lorg/json/JSONObject;I)V")
    public void method3985(JSONObject arg0) throws JSONException {
        class221 var2 = new class221(this);
        var2.field2364 = arg0.optString("text");
        String var4 = arg0.optString("align_x");
        byte var5;
        if (var4.equals("centre")) {
            var5 = 1;
        } else if (var4.equals("bottom") || var4.equals("right")) {
            var5 = 2;
        } else {
            var5 = 0;
        }
        var2.field2370 = var5;
        String var7 = arg0.optString("align_y");
        byte var8;
        if (var7.equals("centre")) {
            var8 = 1;
        } else if (var7.equals("bottom") || var7.equals("right")) {
            var8 = 2;
        } else {
            var8 = 0;
        }
        var2.field2367 = var8;
        var2.field2369 = arg0.optInt("font");
        var2.field2365 = method5278(arg0, "placement");
        this.field2358.add(var2);
    }

    @ObfuscatedName("ih.ae(Lorg/json/JSONObject;I)V")
    public void method3992(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2359 = method5278(arg0, "clickbounds");
        this.field2357 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2354.add(new class208(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2354.add(new class208(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2354.add(new class208(this, var2[var3], 0));
                        } else {
                            this.field2354.add(new class217(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("ih.aa(Lorg/json/JSONObject;I)V")
    public void method3987(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field2356.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2356.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2356.put(var2[var3], 0);
                    } else {
                        this.field2360.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("kh.au(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method5278(JSONObject arg0, String arg1) throws JSONException {
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
