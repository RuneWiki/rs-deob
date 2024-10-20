package deob;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("eq")
public class class156 {

    @ObfuscatedName("eq.r")
    public int field1745 = -1;

    @ObfuscatedName("eq.v")
    public String field1746;

    @ObfuscatedName("eq.y")
    public class103 field1747;

    @ObfuscatedName("eq.c")
    public String field1743 = null;

    @ObfuscatedName("eq.w")
    public float[] field1750 = new float[4];

    @ObfuscatedName("eq.b")
    public ArrayList field1749 = new ArrayList();

    @ObfuscatedName("eq.t")
    public ArrayList field1751 = new ArrayList();

    @ObfuscatedName("eq.g")
    public ArrayList field1752 = new ArrayList();

    @ObfuscatedName("eq.x")
    public Map field1744 = new HashMap();

    @ObfuscatedName("eq.n")
    public Map field1754 = new HashMap();

    @ObfuscatedName("eq.o(Ljava/lang/String;Lce;B)Z")
    public boolean method2826(String arg0, class101 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method2814();
            try {
                this.field1746 = arg0;
                this.field1747 = arg1.method2399(new URL(this.field1746));
                this.field1745 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method2814();
                this.field1745 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("eq.q(Lce;I)V")
    public void method2805(class101 arg0) {
        switch(this.field1745) {
            case 0:
                this.method2815(arg0);
                break;
            case 1:
                this.method2862();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("eq.l(I)I")
    public int method2808() {
        return this.field1745;
    }

    @ObfuscatedName("eq.k(Ljava/lang/String;I)I")
    public int method2807(String arg0) {
        return this.field1744.containsKey(arg0) ? (Integer) this.field1744.get(arg0) : -1;
    }

    @ObfuscatedName("eq.a(Ljava/lang/String;B)Ljava/lang/String;")
    public String method2838(String arg0) {
        return (String) ((String) (this.field1754.containsKey(arg0) ? this.field1754.get(arg0) : null));
    }

    @ObfuscatedName("eq.m(I)Ljava/util/ArrayList;")
    public ArrayList method2851() {
        return this.field1751;
    }

    @ObfuscatedName("eq.p(I)Ljava/util/ArrayList;")
    public ArrayList method2810() {
        return this.field1752;
    }

    @ObfuscatedName("eq.s(I)Ljava/lang/String;")
    public String method2816() {
        return this.field1743;
    }

    @ObfuscatedName("eq.r(B)[F")
    public float[] method2812() {
        return this.field1750;
    }

    @ObfuscatedName("eq.v(I)Ljava/util/ArrayList;")
    public ArrayList method2813() {
        return this.field1749;
    }

    @ObfuscatedName("eq.y(I)V")
    public void method2814() {
        this.field1747 = null;
        this.field1743 = null;
        this.field1750[0] = 0.0F;
        this.field1750[1] = 0.0F;
        this.field1750[2] = 1.0F;
        this.field1750[3] = 1.0F;
        this.field1749.clear();
        this.field1751.clear();
        this.field1752.clear();
        this.field1744.clear();
        this.field1754.clear();
    }

    @ObfuscatedName("eq.c(Lce;B)V")
    public void method2815(class101 arg0) {
        if (this.field1747 == null || !this.field1747.method2415()) {
            return;
        }
        byte[] var2 = this.field1747.method2414();
        if (var2 == null) {
            this.method2814();
            this.field1745 = 100;
            return;
        }
        JSONObject var5;
        try {
            class401 var3 = new class401(var2);
            JSONObject var4 = var3.method6367();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method2814();
            this.field1745 = 102;
            return;
        }
        try {
            this.method2817(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1751.clear();
        }
        try {
            this.method2839(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1752.clear();
        }
        try {
            this.method2824(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1743 = null;
            this.field1750[0] = 0.0F;
            this.field1750[1] = 0.0F;
            this.field1750[2] = 1.0F;
            this.field1750[3] = 1.0F;
            this.field1749.clear();
        }
        try {
            this.method2820(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1744.clear();
            this.field1754.clear();
        }
        this.field1745 = this.field1751.size() > 0 ? 1 : 2;
        this.field1747 = null;
    }

    @ObfuscatedName("eq.w(I)V")
    public void method2862() {
        Iterator var1 = this.field1751.iterator();
        class161 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1751.iterator();
                while (var3.hasNext()) {
                    class161 var4 = (class161) var3.next();
                    if (var4.field1784 != null) {
                        byte[] var5 = var4.field1784.method2414();
                        if (var5 != null && var5.length > 0) {
                            this.field1745 = 2;
                            return;
                        }
                    }
                }
                this.method2814();
                this.field1745 = 101;
                return;
            }
            var2 = (class161) var1.next();
        } while (var2.field1784 == null || var2.field1784.method2415());
    }

    @ObfuscatedName("eq.b(Lorg/json/JSONArray;Lce;B)V")
    public void method2817(JSONArray arg0, class101 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class161 var5 = new class161(this);
                var5.field1784 = arg1.method2399(new URL(var4.getString("src")));
                var5.field1783 = method1860(var4, "placement");
                this.field1751.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("eq.t(Lorg/json/JSONArray;I)V")
    public void method2839(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class163 var4 = new class163(this);
            var4.field1804 = var3.getString("text");
            var4.field1812 = method2658(var3.getString("align_x"));
            var4.field1807 = method2658(var3.getString("align_y"));
            var4.field1808 = var3.getInt("font");
            var4.field1805 = method1860(var3, "placement");
            this.field1752.add(var4);
        }
    }

    @ObfuscatedName("eq.g(Lorg/json/JSONObject;I)V")
    public void method2824(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1750 = method1860(arg0, "clickbounds");
        this.field1743 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1749.add(new class164(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1749.add(new class164(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1749.add(new class164(this, var2[var3], 0));
                        } else {
                            this.field1749.add(new class155(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("eq.x(Lorg/json/JSONObject;B)V")
    public void method2820(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1744.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1744.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1744.put(var2[var3], 0);
                    } else {
                        this.field1754.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("by.n(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method1860(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("eh.e(Ljava/lang/String;I)I")
    public static int method2658(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
