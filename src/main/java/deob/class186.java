package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hj")
public class class186 {

    @ObfuscatedName("hj.al")
    public String field1938;

    @ObfuscatedName("hj.aj")
    public int field1939 = 0;

    @ObfuscatedName("hj.az")
    public ArrayList field1940 = new ArrayList();

    @ObfuscatedName("hj.af")
    public ArrayList field1941 = new ArrayList();

    @ObfuscatedName("hj.aa")
    public ArrayList field1944 = new ArrayList();

    @ObfuscatedName("hj.at")
    public String field1943 = null;

    @ObfuscatedName("hj.ab")
    public float[] field1942 = new float[4];

    @ObfuscatedName("hj.ac")
    public Map field1947 = new HashMap();

    @ObfuscatedName("hj.ao")
    public Map field1946 = new HashMap();

    @ObfuscatedName("hj.ak(I)Ljava/lang/String;")
    public String method3418() {
        return this.field1938;
    }

    @ObfuscatedName("hj.al(B)I")
    public int method3408() {
        return this.field1939;
    }

    @ObfuscatedName("hj.aj(I)V")
    public void method3409() {
        this.field1943 = null;
        this.field1942[0] = 0.0F;
        this.field1942[1] = 0.0F;
        this.field1942[2] = 1.0F;
        this.field1942[3] = 1.0F;
        this.field1940.clear();
        this.field1941.clear();
        this.field1944.clear();
        this.field1947.clear();
        this.field1946.clear();
    }

    @ObfuscatedName("hj.az(Lorg/json/JSONObject;ILeb;B)Z")
    public boolean method3410(JSONObject arg0, int arg1, class116 arg2) {
        JSONObject var4 = arg0;
        if (arg1 < 2) {
            try {
                var4 = var4.getJSONObject("message");
            } catch (Exception var21) {
                this.method3409();
                return false;
            }
            try {
                this.method3430(var4.getJSONArray("images"), arg2);
            } catch (Exception var20) {
                this.field1941.clear();
            }
            try {
                this.method3407(var4.getJSONArray("labels"));
            } catch (Exception var19) {
                this.field1944.clear();
            }
        } else {
            try {
                this.method3412(var4.getJSONObject("image"), arg2);
            } catch (Exception var18) {
                this.field1941.clear();
            }
            try {
                this.method3425(var4.getJSONObject("label"));
            } catch (Exception var17) {
                this.field1944.clear();
            }
        }
        try {
            this.method3415(var4.getJSONObject("behaviour"));
        } catch (Exception var16) {
            this.field1943 = null;
            this.field1942[0] = 0.0F;
            this.field1942[1] = 0.0F;
            this.field1942[2] = 1.0F;
            this.field1942[3] = 1.0F;
            this.field1940.clear();
        }
        try {
            JSONObject var11 = var4.optJSONObject("meta");
            if (var11 != null) {
                this.method3416(var4.getJSONObject("meta"));
            }
        } catch (Exception var15) {
            this.field1947.clear();
            this.field1946.clear();
        }
        if (arg1 == 2) {
            try {
                this.field1938 = var4.getString("id");
                this.field1939 = Integer.parseInt(var4.getString("priority"));
            } catch (Exception var14) {
            }
        }
        return true;
    }

    @ObfuscatedName("hj.af(Lorg/json/JSONArray;Leb;I)V")
    public void method3430(JSONArray arg0, class116 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class176 var5 = new class176(this);
                var5.field1868 = arg1.method2771(new URL(var4.getString("src")));
                var5.field1867 = method3365(var4, "placement");
                this.field1941.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("hj.aa(Lorg/json/JSONObject;Leb;I)V")
    public void method3412(JSONObject arg0, class116 arg1) throws JSONException {
        try {
            class176 var3 = new class176(this);
            var3.field1868 = arg1.method2771(new URL(arg0.getString("src")));
            var3.field1867 = method3365(arg0, "placement");
            this.field1941.add(var3);
        } catch (MalformedURLException var5) {
        }
    }

    @ObfuscatedName("hj.at(Lorg/json/JSONArray;I)V")
    public void method3407(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class187 var4 = new class187(this);
            var4.field1953 = var3.getString("text");
            var4.field1952 = method5037(var3.getString("align_x"));
            var4.field1958 = method5037(var3.getString("align_y"));
            var4.field1954 = var3.getInt("font");
            var4.field1950 = method3365(var3, "placement");
            this.field1944.add(var4);
        }
    }

    @ObfuscatedName("hj.ab(Lorg/json/JSONObject;B)V")
    public void method3425(JSONObject arg0) throws JSONException {
        class187 var2 = new class187(this);
        var2.field1953 = arg0.optString("text");
        var2.field1952 = method5037(arg0.optString("align_x"));
        var2.field1958 = method5037(arg0.optString("align_y"));
        var2.field1954 = arg0.optInt("font");
        var2.field1950 = method3365(arg0, "placement");
        this.field1944.add(var2);
    }

    @ObfuscatedName("hj.ac(Lorg/json/JSONObject;I)V")
    public void method3415(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1942 = method3365(arg0, "clickbounds");
        this.field1943 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1940.add(new class174(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1940.add(new class174(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1940.add(new class174(this, var2[var3], 0));
                        } else {
                            this.field1940.add(new class183(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("hj.ao(Lorg/json/JSONObject;I)V")
    public void method3416(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.optInt(var2[var3]);
                this.field1947.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.optString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1947.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1947.put(var2[var3], 0);
                    } else {
                        this.field1946.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("hm.ah(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method3365(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("kf.av(Ljava/lang/String;B)I")
    public static int method5037(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
