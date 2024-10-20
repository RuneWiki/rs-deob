package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ik")
public class class228 {

    @ObfuscatedName("ik.aw")
    public String field2439;

    @ObfuscatedName("ik.ak")
    public int field2438 = 0;

    @ObfuscatedName("ik.aj")
    public ArrayList field2437 = new ArrayList();

    @ObfuscatedName("ik.ai")
    public ArrayList field2440 = new ArrayList();

    @ObfuscatedName("ik.ay")
    public ArrayList field2441 = new ArrayList();

    @ObfuscatedName("ik.as")
    public String field2442 = null;

    @ObfuscatedName("ik.ae")
    public float[] field2444 = new float[4];

    @ObfuscatedName("ik.am")
    public Map field2443 = new HashMap();

    @ObfuscatedName("ik.at")
    public Map field2445 = new HashMap();

    @ObfuscatedName("ik.ap(I)Ljava/lang/String;")
    public String method4308() {
        return this.field2439;
    }

    @ObfuscatedName("ik.aw(I)I")
    public int method4307() {
        return this.field2438;
    }

    @ObfuscatedName("ik.ak(B)V")
    public void method4310() {
        this.field2442 = null;
        this.field2444[0] = 0.0F;
        this.field2444[1] = 0.0F;
        this.field2444[2] = 1.0F;
        this.field2444[3] = 1.0F;
        this.field2437.clear();
        this.field2440.clear();
        this.field2441.clear();
        this.field2443.clear();
        this.field2445.clear();
    }

    @ObfuscatedName("ik.aj(Lorg/json/JSONObject;ILex;I)Z")
    public boolean method4311(JSONObject arg0, int arg1, class119 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method4310();
                return false;
            }
            try {
                this.method4330(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field2440.clear();
            }
            try {
                this.method4314(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field2441.clear();
            }
        } else {
            try {
                this.method4342(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field2440.clear();
            }
            try {
                this.method4315(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field2441.clear();
            }
        }
        try {
            this.method4316(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field2442 = null;
            this.field2444[0] = 0.0F;
            this.field2444[1] = 0.0F;
            this.field2444[2] = 1.0F;
            this.field2444[3] = 1.0F;
            this.field2437.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method4317(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field2443.clear();
            this.field2445.clear();
        }
        if (arg1 == 2) {
            try {
                this.field2439 = var4.getString("id");
                this.field2438 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("ik.ai(Lorg/json/JSONArray;Lex;I)V")
    public void method4330(JSONArray arg0, class119 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class218 var5 = new class218(this);
                var5.field2365 = arg1.method3078(new URL(var4.getString("src")));
                var5.field2366 = method488(var4, "placement");
                this.field2440.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("ik.ay(Lorg/json/JSONObject;Lex;B)V")
    public void method4342(JSONObject arg0, class119 arg1) throws JSONException {
        try {
            class218 var3 = new class218(this);
            var3.field2365 = arg1.method3078(new URL(arg0.getString("src")));
            var3.field2366 = method488(arg0, "placement");
            this.field2440.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("ik.as(Lorg/json/JSONArray;B)V")
    public void method4314(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class229 var4 = new class229(this);
            var4.field2450 = var3.getString("text");
            var4.field2451 = method8057(var3.getString("align_x"));
            var4.field2448 = method8057(var3.getString("align_y"));
            var4.field2454 = var3.getInt("font");
            var4.field2452 = method488(var3, "placement");
            this.field2441.add(var4);
        }
    }

    @ObfuscatedName("ik.ae(Lorg/json/JSONObject;I)V")
    public void method4315(JSONObject arg0) throws JSONException {
        class229 var2 = new class229(this);
        var2.field2450 = arg0.optString("text");
        var2.field2451 = method8057(arg0.optString("align_x"));
        var2.field2448 = method8057(arg0.optString("align_y"));
        var2.field2454 = arg0.optInt("font");
        var2.field2452 = method488(arg0, "placement");
        this.field2441.add(var2);
    }

    @ObfuscatedName("ik.am(Lorg/json/JSONObject;I)V")
    public void method4316(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2444 = method488(arg0, "clickbounds");
        this.field2442 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2437.add(new class216(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2437.add(new class216(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2437.add(new class216(this, var2[var3], 0));
                        } else {
                            this.field2437.add(new class225(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("ik.at(Lorg/json/JSONObject;B)V")
    public void method4317(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field2443.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2443.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2443.put(var2[var3], 0);
                    } else {
                        this.field2445.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("bp.au(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method488(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("rk.an(Ljava/lang/String;I)I")
    public static int method8057(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
