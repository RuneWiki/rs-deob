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

@ObfuscatedName("es")
public class class156 {

    @ObfuscatedName("es.y")
    public int field1727 = -1;

    @ObfuscatedName("es.i")
    public String field1731;

    @ObfuscatedName("es.s")
    public class103 field1730;

    @ObfuscatedName("es.t")
    public String field1733 = null;

    @ObfuscatedName("es.z")
    public float[] field1734 = new float[4];

    @ObfuscatedName("es.r")
    public ArrayList field1735 = new ArrayList();

    @ObfuscatedName("es.u")
    public ArrayList field1736 = new ArrayList();

    @ObfuscatedName("es.k")
    public ArrayList field1737 = new ArrayList();

    @ObfuscatedName("es.h")
    public Map field1732 = new HashMap();

    @ObfuscatedName("es.x")
    public Map field1725 = new HashMap();

    @ObfuscatedName("es.c(Ljava/lang/String;Lcd;I)Z")
    public boolean method2889(String arg0, class101 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method2941();
            try {
                this.field1731 = arg0;
                this.field1730 = arg1.method2402(new URL(this.field1731));
                this.field1727 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method2941();
                this.field1727 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("es.v(Lcd;I)V")
    public void method2890(class101 arg0) {
        switch(this.field1727) {
            case 0:
                this.method2900(arg0);
                break;
            case 1:
                this.method2901();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("es.q(I)I")
    public int method2891() {
        return this.field1727;
    }

    @ObfuscatedName("es.f(Ljava/lang/String;I)I")
    public int method2911(String arg0) {
        return this.field1732.containsKey(arg0) ? (Integer) this.field1732.get(arg0) : -1;
    }

    @ObfuscatedName("es.j(Ljava/lang/String;I)Ljava/lang/String;")
    public String method2893(String arg0) {
        return (String) ((String) (this.field1725.containsKey(arg0) ? this.field1725.get(arg0) : null));
    }

    @ObfuscatedName("es.e(I)Ljava/util/ArrayList;")
    public ArrayList method2894() {
        return this.field1736;
    }

    @ObfuscatedName("es.g(B)Ljava/util/ArrayList;")
    public ArrayList method2905() {
        return this.field1737;
    }

    @ObfuscatedName("es.w(I)Ljava/lang/String;")
    public String method2916() {
        return this.field1733;
    }

    @ObfuscatedName("es.y(I)[F")
    public float[] method2897() {
        return this.field1734;
    }

    @ObfuscatedName("es.i(B)Ljava/util/ArrayList;")
    public ArrayList method2898() {
        return this.field1735;
    }

    @ObfuscatedName("es.s(S)V")
    public void method2941() {
        this.field1730 = null;
        this.field1733 = null;
        this.field1734[0] = 0.0F;
        this.field1734[1] = 0.0F;
        this.field1734[2] = 1.0F;
        this.field1734[3] = 1.0F;
        this.field1735.clear();
        this.field1736.clear();
        this.field1737.clear();
        this.field1732.clear();
        this.field1725.clear();
    }

    @ObfuscatedName("es.t(Lcd;B)V")
    public void method2900(class101 arg0) {
        if (this.field1730 == null || !this.field1730.method2426()) {
            return;
        }
        byte[] var2 = this.field1730.method2429();
        if (var2 == null) {
            this.method2941();
            this.field1727 = 100;
            return;
        }
        JSONObject var5;
        try {
            class400 var3 = new class400(var2);
            JSONObject var4 = var3.method6465();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method2941();
            this.field1727 = 102;
            return;
        }
        try {
            this.method2917(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1736.clear();
        }
        try {
            this.method2906(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1737.clear();
        }
        try {
            this.method2892(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1733 = null;
            this.field1734[0] = 0.0F;
            this.field1734[1] = 0.0F;
            this.field1734[2] = 1.0F;
            this.field1734[3] = 1.0F;
            this.field1735.clear();
        }
        try {
            this.method2904(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1732.clear();
            this.field1725.clear();
        }
        this.field1727 = this.field1736.size() > 0 ? 1 : 2;
        this.field1730 = null;
    }

    @ObfuscatedName("es.z(B)V")
    public void method2901() {
        Iterator var1 = this.field1736.iterator();
        class161 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1736.iterator();
                while (var3.hasNext()) {
                    class161 var4 = (class161) var3.next();
                    if (var4.field1773 != null) {
                        byte[] var5 = var4.field1773.method2429();
                        if (var5 != null && var5.length > 0) {
                            this.field1727 = 2;
                            return;
                        }
                    }
                }
                this.method2941();
                this.field1727 = 101;
                return;
            }
            var2 = (class161) var1.next();
        } while (var2.field1773 == null || var2.field1773.method2426());
    }

    @ObfuscatedName("es.r(Lorg/json/JSONArray;Lcd;B)V")
    public void method2917(JSONArray arg0, class101 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class161 var5 = new class161(this);
                var5.field1773 = arg1.method2402(new URL(var4.getString("src")));
                var5.field1771 = method3241(var4, "placement");
                this.field1736.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("es.u(Lorg/json/JSONArray;B)V")
    public void method2906(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class162 var4 = new class162(this);
            var4.field1776 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1774 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1778 = var10;
            var4.field1780 = var3.getInt("font");
            var4.field1777 = method3241(var3, "placement");
            this.field1737.add(var4);
        }
    }

    @ObfuscatedName("es.k(Lorg/json/JSONObject;I)V")
    public void method2892(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1734 = method3241(arg0, "clickbounds");
        this.field1733 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1735.add(new class163(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1735.add(new class163(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1735.add(new class163(this, var2[var3], 0));
                        } else {
                            this.field1735.add(new class155(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.h(Lorg/json/JSONObject;I)V")
    public void method2904(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1732.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1732.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1732.put(var2[var3], 0);
                    } else {
                        this.field1725.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("fq.x(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method3241(JSONObject arg0, String arg1) throws JSONException {
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
