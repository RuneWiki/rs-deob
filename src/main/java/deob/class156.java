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

@ObfuscatedName("eu")
public class class156 {

    @ObfuscatedName("eu.o")
    public int field1705 = -1;

    @ObfuscatedName("eu.n")
    public String field1706;

    @ObfuscatedName("eu.d")
    public class103 field1707;

    @ObfuscatedName("eu.a")
    public String field1708 = null;

    @ObfuscatedName("eu.m")
    public float[] field1703 = new float[4];

    @ObfuscatedName("eu.u")
    public ArrayList field1715 = new ArrayList();

    @ObfuscatedName("eu.l")
    public ArrayList field1711 = new ArrayList();

    @ObfuscatedName("eu.z")
    public ArrayList field1712 = new ArrayList();

    @ObfuscatedName("eu.r")
    public Map field1713 = new HashMap();

    @ObfuscatedName("eu.y")
    public Map field1716 = new HashMap();

    @ObfuscatedName("eu.s(Ljava/lang/String;Lcu;I)Z")
    public boolean method2863(String arg0, class101 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method2816();
            try {
                this.field1706 = arg0;
                this.field1707 = arg1.method2369(new URL(this.field1706));
                this.field1705 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method2816();
                this.field1705 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("eu.h(Lcu;I)V")
    public void method2838(class101 arg0) {
        switch(this.field1705) {
            case 0:
                this.method2817(arg0);
                break;
            case 1:
                this.method2818();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("eu.w(I)I")
    public int method2808() {
        return this.field1705;
    }

    @ObfuscatedName("eu.v(Ljava/lang/String;I)I")
    public int method2809(String arg0) {
        return this.field1713.containsKey(arg0) ? (Integer) this.field1713.get(arg0) : -1;
    }

    @ObfuscatedName("eu.c(Ljava/lang/String;B)Ljava/lang/String;")
    public String method2810(String arg0) {
        return (String) ((String) (this.field1716.containsKey(arg0) ? this.field1716.get(arg0) : null));
    }

    @ObfuscatedName("eu.q(I)Ljava/util/ArrayList;")
    public ArrayList method2842() {
        return this.field1711;
    }

    @ObfuscatedName("eu.i(B)Ljava/util/ArrayList;")
    public ArrayList method2812() {
        return this.field1712;
    }

    @ObfuscatedName("eu.k(I)Ljava/lang/String;")
    public String method2813() {
        return this.field1708;
    }

    @ObfuscatedName("eu.o(B)[F")
    public float[] method2814() {
        return this.field1703;
    }

    @ObfuscatedName("eu.n(I)Ljava/util/ArrayList;")
    public ArrayList method2815() {
        return this.field1715;
    }

    @ObfuscatedName("eu.d(I)V")
    public void method2816() {
        this.field1707 = null;
        this.field1708 = null;
        this.field1703[0] = 0.0F;
        this.field1703[1] = 0.0F;
        this.field1703[2] = 1.0F;
        this.field1703[3] = 1.0F;
        this.field1715.clear();
        this.field1711.clear();
        this.field1712.clear();
        this.field1713.clear();
        this.field1716.clear();
    }

    @ObfuscatedName("eu.a(Lcu;B)V")
    public void method2817(class101 arg0) {
        if (this.field1707 == null || !this.field1707.method2384()) {
            return;
        }
        byte[] var2 = this.field1707.method2394();
        if (var2 == null) {
            this.method2816();
            this.field1705 = 100;
            return;
        }
        JSONObject var5;
        try {
            class401 var3 = new class401(var2);
            JSONObject var4 = var3.method6383();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method2816();
            this.field1705 = 102;
            return;
        }
        try {
            this.method2819(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1711.clear();
        }
        try {
            this.method2811(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1712.clear();
        }
        try {
            this.method2821(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1708 = null;
            this.field1703[0] = 0.0F;
            this.field1703[1] = 0.0F;
            this.field1703[2] = 1.0F;
            this.field1703[3] = 1.0F;
            this.field1715.clear();
        }
        try {
            this.method2822(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1713.clear();
            this.field1716.clear();
        }
        this.field1705 = this.field1711.size() > 0 ? 1 : 2;
        this.field1707 = null;
    }

    @ObfuscatedName("eu.m(I)V")
    public void method2818() {
        Iterator var1 = this.field1711.iterator();
        class161 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1711.iterator();
                while (var3.hasNext()) {
                    class161 var4 = (class161) var3.next();
                    if (var4.field1750 != null) {
                        byte[] var5 = var4.field1750.method2394();
                        if (var5 != null && var5.length > 0) {
                            this.field1705 = 2;
                            return;
                        }
                    }
                }
                this.method2816();
                this.field1705 = 101;
                return;
            }
            var2 = (class161) var1.next();
        } while (var2.field1750 == null || var2.field1750.method2384());
    }

    @ObfuscatedName("eu.u(Lorg/json/JSONArray;Lcu;B)V")
    public void method2819(JSONArray arg0, class101 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class161 var5 = new class161(this);
                var5.field1750 = arg1.method2369(new URL(var4.getString("src")));
                var5.field1749 = method2783(var4, "placement");
                this.field1711.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("eu.l(Lorg/json/JSONArray;I)V")
    public void method2811(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class162 var4 = new class162(this);
            var4.field1756 = var3.getString("text");
            var4.field1759 = method3882(var3.getString("align_x"));
            var4.field1758 = method3882(var3.getString("align_y"));
            var4.field1760 = var3.getInt("font");
            var4.field1753 = method2783(var3, "placement");
            this.field1712.add(var4);
        }
    }

    @ObfuscatedName("eu.z(Lorg/json/JSONObject;B)V")
    public void method2821(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1703 = method2783(arg0, "clickbounds");
        this.field1708 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1715.add(new class163(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1715.add(new class163(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1715.add(new class163(this, var2[var3], 0));
                        } else {
                            this.field1715.add(new class155(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("eu.r(Lorg/json/JSONObject;I)V")
    public void method2822(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1713.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1713.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1713.put(var2[var3], 0);
                    } else {
                        this.field1716.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("ey.y(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method2783(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("gq.p(Ljava/lang/String;I)I")
    public static int method3882(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
