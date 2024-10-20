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

@ObfuscatedName("ic")
public class class209 {

    @ObfuscatedName("ic.al")
    public int field2256 = -1;

    @ObfuscatedName("ic.az")
    public String field2260;

    @ObfuscatedName("ic.ap")
    public class115 field2258;

    @ObfuscatedName("ic.av")
    public String field2251 = null;

    @ObfuscatedName("ic.ax")
    public float[] field2259 = new float[4];

    @ObfuscatedName("ic.as")
    public ArrayList field2257 = new ArrayList();

    @ObfuscatedName("ic.ay")
    public ArrayList field2262 = new ArrayList();

    @ObfuscatedName("ic.ak")
    public ArrayList field2267 = new ArrayList();

    @ObfuscatedName("ic.aj")
    public Map field2264 = new HashMap();

    @ObfuscatedName("ic.am")
    public Map field2265 = new HashMap();

    @ObfuscatedName("ic.at(Ljava/lang/String;Lel;B)Z")
    public boolean method3846(String arg0, class113 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3827();
            try {
                this.field2260 = arg0;
                this.field2258 = arg1.method2741(new URL(this.field2260));
                this.field2256 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3827();
                this.field2256 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("ic.ah(Lel;I)V")
    public void method3800(class113 arg0) {
        switch(this.field2256) {
            case 0:
                this.method3801(arg0);
                break;
            case 1:
                this.method3819();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("ic.ar(B)I")
    public int method3809() {
        return this.field2256;
    }

    @ObfuscatedName("ic.ao(Ljava/lang/String;I)I")
    public int method3799(String arg0) {
        return this.field2264.containsKey(arg0) ? (Integer) this.field2264.get(arg0) : -1;
    }

    @ObfuscatedName("ic.ab(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3803(String arg0) {
        return (String) ((String) (this.field2265.containsKey(arg0) ? this.field2265.get(arg0) : null));
    }

    @ObfuscatedName("ic.au(I)Ljava/util/ArrayList;")
    public ArrayList method3804() {
        return this.field2262;
    }

    @ObfuscatedName("ic.aa(I)Ljava/util/ArrayList;")
    public ArrayList method3805() {
        return this.field2267;
    }

    @ObfuscatedName("ic.ac(I)Ljava/lang/String;")
    public String method3806() {
        return this.field2251;
    }

    @ObfuscatedName("ic.al(B)[F")
    public float[] method3868() {
        return this.field2259;
    }

    @ObfuscatedName("ic.az(I)Ljava/util/ArrayList;")
    public ArrayList method3808() {
        return this.field2257;
    }

    @ObfuscatedName("ic.ap(I)V")
    public void method3827() {
        this.field2258 = null;
        this.field2251 = null;
        this.field2259[0] = 0.0F;
        this.field2259[1] = 0.0F;
        this.field2259[2] = 1.0F;
        this.field2259[3] = 1.0F;
        this.field2257.clear();
        this.field2262.clear();
        this.field2267.clear();
        this.field2264.clear();
        this.field2265.clear();
    }

    @ObfuscatedName("ic.av(Lel;I)V")
    public void method3801(class113 arg0) {
        if (this.field2258 == null || !this.field2258.method2770()) {
            return;
        }
        byte[] var2 = this.field2258.method2774();
        if (var2 == null) {
            this.method3827();
            this.field2256 = 100;
            return;
        }
        try {
            this.method3816(new class475(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3827();
            this.field2256 = 102;
            return;
        }
        this.field2256 = this.field2262.size() > 0 ? 1 : 2;
        this.field2258 = null;
    }

    @ObfuscatedName("ic.ax(I)V")
    public void method3819() {
        Iterator var1 = this.field2262.iterator();
        class215 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field2262.iterator();
                while (var3.hasNext()) {
                    class215 var4 = (class215) var3.next();
                    if (var4.field2304 != null) {
                        byte[] var5 = var4.field2304.method2774();
                        if (var5 != null && var5.length > 0) {
                            this.field2256 = 2;
                            return;
                        }
                    }
                }
                this.method3827();
                this.field2256 = 101;
                return;
            }
            var2 = (class215) var1.next();
        } while (var2.field2304 == null || var2.field2304.method2770());
    }

    @ObfuscatedName("ic.as(Lorg/json/JSONArray;Lel;I)V")
    public void method3832(JSONArray arg0, class113 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class215 var5 = new class215(this);
                var5.field2304 = arg1.method2741(new URL(var4.getString("src")));
                var5.field2301 = method78(var4, "placement");
                this.field2262.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("ic.ay(Lorg/json/JSONArray;B)V")
    public void method3813(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class216 var4 = new class216(this);
            var4.field2313 = var3.getString("text");
            var4.field2309 = method488(var3.getString("align_x"));
            var4.field2310 = method488(var3.getString("align_y"));
            var4.field2311 = var3.getInt("font");
            var4.field2307 = method78(var3, "placement");
            this.field2267.add(var4);
        }
    }

    @ObfuscatedName("ic.ak(Lorg/json/JSONObject;I)V")
    public void method3814(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field2259 = method78(arg0, "clickbounds");
        this.field2251 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field2257.add(new class217(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field2257.add(new class217(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field2257.add(new class217(this, var2[var3], 0));
                        } else {
                            this.field2257.add(new class208(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("ic.aj(Lorg/json/JSONObject;B)V")
    public void method3815(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field2264.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field2264.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field2264.put(var2[var3], 0);
                    } else {
                        this.field2265.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("ic.am(Lsv;Lel;I)V")
    public void method3816(class475 arg0, class113 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7794();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3827();
            this.field2256 = 102;
            return;
        }
        try {
            this.method3832(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field2262.clear();
        }
        try {
            this.method3813(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field2267.clear();
        }
        try {
            this.method3814(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field2251 = null;
            this.field2259[0] = 0.0F;
            this.field2259[1] = 0.0F;
            this.field2259[2] = 1.0F;
            this.field2259[3] = 1.0F;
            this.field2257.clear();
        }
        try {
            this.method3815(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field2264.clear();
            this.field2265.clear();
        }
    }

    @ObfuscatedName("ic.aq(Ljava/lang/String;Lel;I)Z")
    public boolean method3817(String arg0, class113 arg1) {
        try {
            this.method3816(new class475(arg0.getBytes()), arg1);
            this.field2256 = this.field2262.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field2256 = 102;
        }
        return this.field2256 < 100;
    }

    @ObfuscatedName("az.ai(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method78(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("ba.aw(Ljava/lang/String;I)I")
    public static int method488(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
