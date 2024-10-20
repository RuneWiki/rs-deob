package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("if")
public class class225 {

    @ObfuscatedName("if.ad")
    public String field2405;

    @ObfuscatedName("if.ag")
    public int field2406 = 0;

    @ObfuscatedName("if.ak")
    public ArrayList field2410 = new ArrayList();

    @ObfuscatedName("if.ap")
    public ArrayList field2408 = new ArrayList();

    @ObfuscatedName("if.an")
    public ArrayList field2407 = new ArrayList();

    @ObfuscatedName("if.aj")
    public String field2404 = null;

    @ObfuscatedName("if.av")
    public float[] field2411 = new float[4];

    @ObfuscatedName("if.ab")
    public Map field2413 = new HashMap();

    @ObfuscatedName("if.ai")
    public Map field2409 = new HashMap();

    @ObfuscatedName("if.aq(I)Ljava/lang/String;")
    public String method3967() {
        return this.field2405;
    }

    @ObfuscatedName("if.ad(I)I")
    public int method3974() {
        return this.field2406;
    }

    @ObfuscatedName("if.ag(B)V")
    public void method3970() {
        this.field2404 = null;
        this.field2411[0] = 0.0F;
        this.field2411[1] = 0.0F;
        this.field2411[2] = 1.0F;
        this.field2411[3] = 1.0F;
        this.field2410.clear();
        this.field2408.clear();
        this.field2407.clear();
        this.field2413.clear();
        this.field2409.clear();
    }

    @ObfuscatedName("if.ak(Lorg/json/JSONObject;ILea;I)Z")
    public boolean method3962(JSONObject arg0, int arg1, class117 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method3970();
                return false;
            }
            try {
                this.method3963(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field2408.clear();
            }
            try {
                this.method3965(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field2407.clear();
            }
        } else {
            try {
                this.method3964(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field2408.clear();
            }
            try {
                this.method3966(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field2407.clear();
            }
        }
        try {
            this.method3985(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field2404 = null;
            this.field2411[0] = 0.0F;
            this.field2411[1] = 0.0F;
            this.field2411[2] = 1.0F;
            this.field2411[3] = 1.0F;
            this.field2410.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method3968(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field2413.clear();
            this.field2409.clear();
        }
        if (arg1 == 2) {
            try {
                this.field2405 = var4.getString("id");
                this.field2406 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("if.ap(Lorg/json/JSONArray;Lea;I)V")
    public void method3963(JSONArray arg0, class117 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class215 var5 = new class215(this);
                var5.field2341 = arg1.method2797(new URL(var4.getString("src")));
                var5.field2339 = method5539(var4, "placement");
                this.field2408.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("if.an(Lorg/json/JSONObject;Lea;I)V")
    public void method3964(JSONObject arg0, class117 arg1) throws JSONException {
        try {
            class215 var3 = new class215(this);
            var3.field2341 = arg1.method2797(new URL(arg0.getString("src")));
            var3.field2339 = method5539(arg0, "placement");
            this.field2408.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("if.aj(Lorg/json/JSONArray;I)V")
    public void method3965(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class226 var4 = new class226(this);
            var4.field2418 = var3.getString("text");
            var4.field2419 = Statics.method3925(var3.getString("align_x"));
            var4.field2421 = Statics.method3925(var3.getString("align_y"));
            var4.field2422 = var3.getInt("font");
            var4.field2416 = method5539(var3, "placement");
            this.field2407.add(var4);
        }
    }

    @ObfuscatedName("if.av(Lorg/json/JSONObject;I)V")
    public void method3966(JSONObject arg0) throws JSONException {
        class226 var2 = new class226(this);
        var2.field2418 = arg0.optString("text");
        var2.field2419 = Statics.method3925(arg0.optString("align_x"));
        var2.field2421 = Statics.method3925(arg0.optString("align_y"));
        var2.field2422 = arg0.optInt("font");
        var2.field2416 = method5539(arg0, "placement");
        this.field2407.add(var2);
    }

    @ObfuscatedName("if.ab(Lorg/json/JSONObject;I)V")
    public void method3985(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2411 = method5539(arg0, "clickbounds");
        this.field2404 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2410.add(new class213(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2410.add(new class213(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2410.add(new class213(this, var2[var3], 0));
                        } else {
                            this.field2410.add(new class222(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("if.ai(Lorg/json/JSONObject;I)V")
    public void method3968(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field2413.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2413.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2413.put(var2[var3], 0);
                    } else {
                        this.field2409.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("mn.ae(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method5539(JSONObject arg0, String arg1) throws JSONException {
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
