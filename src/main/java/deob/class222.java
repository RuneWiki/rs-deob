package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class222 {

    @ObfuscatedName("it.aw")
    public String field2392;

    @ObfuscatedName("it.al")
    public int field2384 = 0;

    @ObfuscatedName("it.ai")
    public ArrayList field2385 = new ArrayList();

    @ObfuscatedName("it.ar")
    public ArrayList field2386 = new ArrayList();

    @ObfuscatedName("it.as")
    public ArrayList field2387 = new ArrayList();

    @ObfuscatedName("it.aa")
    public String field2388 = null;

    @ObfuscatedName("it.az")
    public float[] field2383 = new float[4];

    @ObfuscatedName("it.ao")
    public Map field2390 = new HashMap();

    @ObfuscatedName("it.au")
    public Map field2389 = new HashMap();

    @ObfuscatedName("it.aq(B)Ljava/lang/String;")
    public String method3963() {
        return this.field2392;
    }

    @ObfuscatedName("it.aw(I)I")
    public int method3984() {
        return this.field2384;
    }

    @ObfuscatedName("it.al(I)V")
    public void method3948() {
        this.field2388 = null;
        this.field2383[0] = 0.0F;
        this.field2383[1] = 0.0F;
        this.field2383[2] = 1.0F;
        this.field2383[3] = 1.0F;
        this.field2385.clear();
        this.field2386.clear();
        this.field2387.clear();
        this.field2390.clear();
        this.field2389.clear();
    }

    @ObfuscatedName("it.ai(Lorg/json/JSONObject;ILel;I)Z")
    public boolean method3952(JSONObject arg0, int arg1, class114 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method3948();
                return false;
            }
            try {
                this.method3987(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field2386.clear();
            }
            try {
                this.method3955(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field2387.clear();
            }
        } else {
            try {
                this.method3960(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field2386.clear();
            }
            try {
                this.method3956(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field2387.clear();
            }
        }
        try {
            this.method3957(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field2388 = null;
            this.field2383[0] = 0.0F;
            this.field2383[1] = 0.0F;
            this.field2383[2] = 1.0F;
            this.field2383[3] = 1.0F;
            this.field2385.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method3958(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field2390.clear();
            this.field2389.clear();
        }
        if (arg1 == 2) {
            try {
                this.field2392 = var4.getString("id");
                this.field2384 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("it.ar(Lorg/json/JSONArray;Lel;I)V")
    public void method3987(JSONArray arg0, class114 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class212 var5 = new class212(this);
                var5.field2312 = arg1.method2761(new URL(var4.getString("src")));
                var5.field2310 = method2983(var4, "placement");
                this.field2386.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("it.as(Lorg/json/JSONObject;Lel;B)V")
    public void method3960(JSONObject arg0, class114 arg1) throws JSONException {
        try {
            class212 var3 = new class212(this);
            var3.field2312 = arg1.method2761(new URL(arg0.getString("src")));
            var3.field2310 = method2983(arg0, "placement");
            this.field2386.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("it.aa(Lorg/json/JSONArray;I)V")
    public void method3955(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class223 var4 = new class223(this);
            var4.field2395 = var3.getString("text");
            var4.field2396 = method4023(var3.getString("align_x"));
            var4.field2397 = method4023(var3.getString("align_y"));
            var4.field2398 = var3.getInt("font");
            var4.field2400 = method2983(var3, "placement");
            this.field2387.add(var4);
        }
    }

    @ObfuscatedName("it.az(Lorg/json/JSONObject;B)V")
    public void method3956(JSONObject arg0) throws JSONException {
        class223 var2 = new class223(this);
        var2.field2395 = arg0.optString("text");
        var2.field2396 = method4023(arg0.optString("align_x"));
        var2.field2397 = method4023(arg0.optString("align_y"));
        var2.field2398 = arg0.optInt("font");
        var2.field2400 = method2983(arg0, "placement");
        this.field2387.add(var2);
    }

    @ObfuscatedName("it.ao(Lorg/json/JSONObject;I)V")
    public void method3957(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2383 = method2983(arg0, "clickbounds");
        this.field2388 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2385.add(new class210(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2385.add(new class210(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2385.add(new class210(this, var2[var3], 0));
                        } else {
                            this.field2385.add(new class219(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("it.au(Lorg/json/JSONObject;I)V")
    public void method3958(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field2390.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2390.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2390.put(var2[var3], 0);
                    } else {
                        this.field2389.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("fq.ak(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method2983(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("ir.ah(Ljava/lang/String;B)I")
    public static int method4023(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
