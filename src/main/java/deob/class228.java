package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("iy")
public class class228 {

    @ObfuscatedName("iy.ae")
    public String field2439;

    @ObfuscatedName("iy.ag")
    public int field2440 = 0;

    @ObfuscatedName("iy.am")
    public ArrayList field2441 = new ArrayList();

    @ObfuscatedName("iy.ax")
    public ArrayList field2444 = new ArrayList();

    @ObfuscatedName("iy.aq")
    public ArrayList field2443 = new ArrayList();

    @ObfuscatedName("iy.af")
    public String field2438 = null;

    @ObfuscatedName("iy.at")
    public float[] field2445 = new float[4];

    @ObfuscatedName("iy.au")
    public Map field2446 = new HashMap();

    @ObfuscatedName("iy.ar")
    public Map field2447 = new HashMap();

    @ObfuscatedName("iy.ac(I)Ljava/lang/String;")
    public String method4187() {
        return this.field2439;
    }

    @ObfuscatedName("iy.ae(I)I")
    public int method4173() {
        return this.field2440;
    }

    @ObfuscatedName("iy.ag(B)V")
    public void method4174() {
        this.field2438 = null;
        this.field2445[0] = 0.0F;
        this.field2445[1] = 0.0F;
        this.field2445[2] = 1.0F;
        this.field2445[3] = 1.0F;
        this.field2441.clear();
        this.field2444.clear();
        this.field2443.clear();
        this.field2446.clear();
        this.field2447.clear();
    }

    @ObfuscatedName("iy.am(Lorg/json/JSONObject;ILen;I)Z")
    public boolean method4175(JSONObject arg0, int arg1, class119 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method4174();
                return false;
            }
            try {
                this.method4176(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field2444.clear();
            }
            try {
                this.method4171(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field2443.clear();
            }
        } else {
            try {
                this.method4177(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field2444.clear();
            }
            try {
                this.method4201(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field2443.clear();
            }
        }
        try {
            this.method4180(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field2438 = null;
            this.field2445[0] = 0.0F;
            this.field2445[1] = 0.0F;
            this.field2445[2] = 1.0F;
            this.field2445[3] = 1.0F;
            this.field2441.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method4181(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field2446.clear();
            this.field2447.clear();
        }
        if (arg1 == 2) {
            try {
                this.field2439 = var4.getString("id");
                this.field2440 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("iy.ax(Lorg/json/JSONArray;Len;I)V")
    public void method4176(JSONArray arg0, class119 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class218 var5 = new class218(this);
                var5.field2370 = arg1.method2971(new URL(var4.getString("src")));
                var5.field2369 = method5563(var4, "placement");
                this.field2444.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("iy.aq(Lorg/json/JSONObject;Len;I)V")
    public void method4177(JSONObject arg0, class119 arg1) throws JSONException {
        try {
            class218 var3 = new class218(this);
            var3.field2370 = arg1.method2971(new URL(arg0.getString("src")));
            var3.field2369 = method5563(arg0, "placement");
            this.field2444.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("iy.af(Lorg/json/JSONArray;I)V")
    public void method4171(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class229 var4 = new class229(this);
            var4.field2452 = var3.getString("text");
            var4.field2450 = method4106(var3.getString("align_x"));
            var4.field2451 = method4106(var3.getString("align_y"));
            var4.field2448 = var3.getInt("font");
            var4.field2449 = method5563(var3, "placement");
            this.field2443.add(var4);
        }
    }

    @ObfuscatedName("iy.at(Lorg/json/JSONObject;B)V")
    public void method4201(JSONObject arg0) throws JSONException {
        class229 var2 = new class229(this);
        var2.field2452 = arg0.optString("text");
        String var4 = arg0.optString("align_x");
        byte var5;
        if (var4.equals("centre")) {
            var5 = 1;
        } else if (var4.equals("bottom") || var4.equals("right")) {
            var5 = 2;
        } else {
            var5 = 0;
        }
        var2.field2450 = var5;
        var2.field2451 = method4106(arg0.optString("align_y"));
        var2.field2448 = arg0.optInt("font");
        var2.field2449 = method5563(arg0, "placement");
        this.field2443.add(var2);
    }

    @ObfuscatedName("iy.au(Lorg/json/JSONObject;B)V")
    public void method4180(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2445 = method5563(arg0, "clickbounds");
        this.field2438 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2441.add(new class216(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2441.add(new class216(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2441.add(new class216(this, var2[var3], 0));
                        } else {
                            this.field2441.add(new class225(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("iy.ar(Lorg/json/JSONObject;I)V")
    public void method4181(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field2446.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2446.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2446.put(var2[var3], 0);
                    } else {
                        this.field2447.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("le.al(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method5563(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("il.ad(Ljava/lang/String;I)I")
    public static int method4106(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
