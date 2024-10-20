package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ii")
public class class222 {

    @ObfuscatedName("ii.ay")
    public String field2407;

    @ObfuscatedName("ii.an")
    public int field2402 = 0;

    @ObfuscatedName("ii.au")
    public ArrayList field2404 = new ArrayList();

    @ObfuscatedName("ii.ax")
    public ArrayList field2400 = new ArrayList();

    @ObfuscatedName("ii.ao")
    public ArrayList field2405 = new ArrayList();

    @ObfuscatedName("ii.am")
    public String field2406 = null;

    @ObfuscatedName("ii.ac")
    public float[] field2401 = new float[4];

    @ObfuscatedName("ii.ae")
    public Map field2408 = new HashMap();

    @ObfuscatedName("ii.ad")
    public Map field2409 = new HashMap();

    @ObfuscatedName("ii.ab(I)Ljava/lang/String;")
    public String method4287() {
        return this.field2407;
    }

    @ObfuscatedName("ii.ay(I)I")
    public int method4295() {
        return this.field2402;
    }

    @ObfuscatedName("ii.an(I)V")
    public void method4289() {
        this.field2406 = null;
        this.field2401[0] = 0.0F;
        this.field2401[1] = 0.0F;
        this.field2401[2] = 1.0F;
        this.field2401[3] = 1.0F;
        this.field2404.clear();
        this.field2400.clear();
        this.field2405.clear();
        this.field2408.clear();
        this.field2409.clear();
    }

    @ObfuscatedName("ii.au(Lorg/json/JSONObject;ILex;I)Z")
    public boolean method4307(JSONObject arg0, int arg1, class117 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method4289();
                return false;
            }
            try {
                this.method4291(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field2400.clear();
            }
            try {
                this.method4293(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field2405.clear();
            }
        } else {
            try {
                this.method4292(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field2400.clear();
            }
            try {
                this.method4305(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field2405.clear();
            }
        }
        try {
            this.method4294(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field2406 = null;
            this.field2401[0] = 0.0F;
            this.field2401[1] = 0.0F;
            this.field2401[2] = 1.0F;
            this.field2401[3] = 1.0F;
            this.field2404.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method4296(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field2408.clear();
            this.field2409.clear();
        }
        if (arg1 == 2) {
            try {
                this.field2407 = var4.getString("id");
                this.field2402 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("ii.ax(Lorg/json/JSONArray;Lex;I)V")
    public void method4291(JSONArray arg0, class117 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class212 var5 = new class212(this);
                var5.field2340 = arg1.method2856(new URL(var4.getString("src")));
                var5.field2335 = method295(var4, "placement");
                this.field2400.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("ii.ao(Lorg/json/JSONObject;Lex;B)V")
    public void method4292(JSONObject arg0, class117 arg1) throws JSONException {
        try {
            class212 var3 = new class212(this);
            var3.field2340 = arg1.method2856(new URL(arg0.getString("src")));
            var3.field2335 = method295(arg0, "placement");
            this.field2400.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("ii.am(Lorg/json/JSONArray;B)V")
    public void method4293(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class223 var4 = new class223(this);
            var4.field2416 = var3.getString("text");
            var4.field2411 = method3896(var3.getString("align_x"));
            var4.field2417 = method3896(var3.getString("align_y"));
            var4.field2410 = var3.getInt("font");
            var4.field2414 = method295(var3, "placement");
            this.field2405.add(var4);
        }
    }

    @ObfuscatedName("ii.ac(Lorg/json/JSONObject;I)V")
    public void method4305(JSONObject arg0) throws JSONException {
        class223 var2 = new class223(this);
        var2.field2416 = arg0.optString("text");
        var2.field2411 = method3896(arg0.optString("align_x"));
        var2.field2417 = method3896(arg0.optString("align_y"));
        var2.field2410 = arg0.optInt("font");
        var2.field2414 = method295(arg0, "placement");
        this.field2405.add(var2);
    }

    @ObfuscatedName("ii.ae(Lorg/json/JSONObject;I)V")
    public void method4294(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2401 = method295(arg0, "clickbounds");
        this.field2406 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2404.add(new class210(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2404.add(new class210(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2404.add(new class210(this, var2[var3], 0));
                        } else {
                            this.field2404.add(new class219(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("ii.ad(Lorg/json/JSONObject;I)V")
    public void method4296(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field2408.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2408.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2408.put(var2[var3], 0);
                    } else {
                        this.field2409.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("ai.aq(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method295(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("hg.al(Ljava/lang/String;B)I")
    public static int method3896(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
