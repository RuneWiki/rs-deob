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

@ObfuscatedName("ev")
public class class156 {

    @ObfuscatedName("ev.q")
    public int field1695 = -1;

    @ObfuscatedName("ev.o")
    public String field1703;

    @ObfuscatedName("ev.r")
    public class103 field1697;

    @ObfuscatedName("ev.p")
    public String field1705 = null;

    @ObfuscatedName("ev.w")
    public float[] field1706 = new float[4];

    @ObfuscatedName("ev.k")
    public ArrayList field1707 = new ArrayList();

    @ObfuscatedName("ev.d")
    public ArrayList field1708 = new ArrayList();

    @ObfuscatedName("ev.m")
    public ArrayList field1709 = new ArrayList();

    @ObfuscatedName("ev.u")
    public Map field1710 = new HashMap();

    @ObfuscatedName("ev.t")
    public Map field1711 = new HashMap();

    @ObfuscatedName("ev.v(Ljava/lang/String;Lck;I)Z")
    public boolean method2894(String arg0, class101 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method2885();
            try {
                this.field1703 = arg0;
                this.field1697 = arg1.method2402(new URL(this.field1703));
                this.field1695 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method2885();
                this.field1695 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("ev.c(Lck;I)V")
    public void method2877(class101 arg0) {
        switch(this.field1695) {
            case 0:
                this.method2886(arg0);
                break;
            case 1:
                this.method2887();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("ev.i(I)I")
    public int method2923() {
        return this.field1695;
    }

    @ObfuscatedName("ev.f(Ljava/lang/String;B)I")
    public int method2882(String arg0) {
        return this.field1710.containsKey(arg0) ? (Integer) this.field1710.get(arg0) : -1;
    }

    @ObfuscatedName("ev.b(Ljava/lang/String;I)Ljava/lang/String;")
    public String method2916(String arg0) {
        return (String) (this.field1711.containsKey(arg0) ? this.field1711.get(arg0) : null);
    }

    @ObfuscatedName("ev.n(B)Ljava/util/ArrayList;")
    public ArrayList method2880() {
        return this.field1708;
    }

    @ObfuscatedName("ev.s(I)Ljava/util/ArrayList;")
    public ArrayList method2922() {
        return this.field1709;
    }

    @ObfuscatedName("ev.l(B)Ljava/lang/String;")
    public String method2881() {
        return this.field1705;
    }

    @ObfuscatedName("ev.q(I)[F")
    public float[] method2883() {
        return this.field1706;
    }

    @ObfuscatedName("ev.o(I)Ljava/util/ArrayList;")
    public ArrayList method2884() {
        return this.field1707;
    }

    @ObfuscatedName("ev.r(I)V")
    public void method2885() {
        this.field1697 = null;
        this.field1705 = null;
        this.field1706[0] = 0.0F;
        this.field1706[1] = 0.0F;
        this.field1706[2] = 1.0F;
        this.field1706[3] = 1.0F;
        this.field1707.clear();
        this.field1708.clear();
        this.field1709.clear();
        this.field1710.clear();
        this.field1711.clear();
    }

    @ObfuscatedName("ev.p(Lck;B)V")
    public void method2886(class101 arg0) {
        if (this.field1697 == null || !this.field1697.method2444()) {
            return;
        }
        byte[] var2 = this.field1697.method2431();
        if (var2 == null) {
            this.method2885();
            this.field1695 = 100;
            return;
        }
        JSONObject var5;
        try {
            class400 var3 = new class400(var2);
            JSONObject var4 = var3.method6487();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method2885();
            this.field1695 = 102;
            return;
        }
        try {
            this.method2888(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1708.clear();
        }
        try {
            this.method2889(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1709.clear();
        }
        try {
            this.method2890(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1705 = null;
            this.field1706[0] = 0.0F;
            this.field1706[1] = 0.0F;
            this.field1706[2] = 1.0F;
            this.field1706[3] = 1.0F;
            this.field1707.clear();
        }
        try {
            this.method2933(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1710.clear();
            this.field1711.clear();
        }
        this.field1695 = this.field1708.size() > 0 ? 1 : 2;
        this.field1697 = null;
    }

    @ObfuscatedName("ev.w(I)V")
    public void method2887() {
        Iterator var1 = this.field1708.iterator();
        class161 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1708.iterator();
                while (var3.hasNext()) {
                    class161 var4 = (class161) var3.next();
                    if (var4.field1738 != null) {
                        byte[] var5 = var4.field1738.method2431();
                        if (var5 != null && var5.length > 0) {
                            this.field1695 = 2;
                            return;
                        }
                    }
                }
                this.method2885();
                this.field1695 = 101;
                return;
            }
            var2 = (class161) var1.next();
        } while (var2.field1738 == null || var2.field1738.method2444());
    }

    @ObfuscatedName("ev.k(Lorg/json/JSONArray;Lck;B)V")
    public void method2888(JSONArray arg0, class101 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class161 var5 = new class161(this);
                var5.field1738 = arg1.method2402(new URL(var4.getString("src")));
                var5.field1736 = method3162(var4, "placement");
                this.field1708.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("ev.d(Lorg/json/JSONArray;I)V")
    public void method2889(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class163 var4 = new class163(this);
            var4.field1759 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1756 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1757 = var10;
            var4.field1753 = var3.getInt("font");
            var4.field1755 = method3162(var3, "placement");
            this.field1709.add(var4);
        }
    }

    @ObfuscatedName("ev.m(Lorg/json/JSONObject;I)V")
    public void method2890(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1706 = method3162(arg0, "clickbounds");
        this.field1705 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1707.add(new class164(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1707.add(new class164(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1707.add(new class164(this, var2[var3], 0));
                        } else {
                            this.field1707.add(new class155(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.u(Lorg/json/JSONObject;I)V")
    public void method2933(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1710.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1710.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1710.put(var2[var3], 0);
                    } else {
                        this.field1711.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("fw.t(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method3162(JSONObject arg0, String arg1) throws JSONException {
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
