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

@ObfuscatedName("fk")
public class class164 {

    @ObfuscatedName("fk.u")
    public int field1832 = -1;

    @ObfuscatedName("fk.b")
    public String field1833;

    @ObfuscatedName("fk.j")
    public class111 field1835;

    @ObfuscatedName("fk.g")
    public String field1828 = null;

    @ObfuscatedName("fk.i")
    public float[] field1829 = new float[4];

    @ObfuscatedName("fk.o")
    public ArrayList field1837 = new ArrayList();

    @ObfuscatedName("fk.n")
    public ArrayList field1838 = new ArrayList();

    @ObfuscatedName("fk.k")
    public ArrayList field1834 = new ArrayList();

    @ObfuscatedName("fk.a")
    public Map field1840 = new HashMap();

    @ObfuscatedName("fk.s")
    public Map field1841 = new HashMap();

    @ObfuscatedName("fk.h(Ljava/lang/String;Ldl;I)Z")
    public boolean method3057(String arg0, class109 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3072();
            try {
                this.field1833 = arg0;
                this.field1835 = arg1.method2608(new URL(this.field1833));
                this.field1832 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3072();
                this.field1832 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("fk.e(Ldl;S)V")
    public void method3058(class109 arg0) {
        switch(this.field1832) {
            case 0:
                this.method3067(arg0);
                break;
            case 1:
                this.method3068();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("fk.v(I)I")
    public int method3059() {
        return this.field1832;
    }

    @ObfuscatedName("fk.x(Ljava/lang/String;I)I")
    public int method3060(String arg0) {
        return this.field1840.containsKey(arg0) ? (Integer) this.field1840.get(arg0) : -1;
    }

    @ObfuscatedName("fk.m(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3061(String arg0) {
        return (String) ((String) (this.field1841.containsKey(arg0) ? this.field1841.get(arg0) : null));
    }

    @ObfuscatedName("fk.q(B)Ljava/util/ArrayList;")
    public ArrayList method3070() {
        return this.field1838;
    }

    @ObfuscatedName("fk.f(B)Ljava/util/ArrayList;")
    public ArrayList method3063() {
        return this.field1834;
    }

    @ObfuscatedName("fk.r(B)Ljava/lang/String;")
    public String method3064() {
        return this.field1828;
    }

    @ObfuscatedName("fk.u(I)Ljava/util/ArrayList;")
    public ArrayList method3065() {
        return this.field1837;
    }

    @ObfuscatedName("fk.b(I)V")
    public void method3072() {
        this.field1835 = null;
        this.field1828 = null;
        this.field1829[0] = 0.0F;
        this.field1829[1] = 0.0F;
        this.field1829[2] = 1.0F;
        this.field1829[3] = 1.0F;
        this.field1837.clear();
        this.field1838.clear();
        this.field1834.clear();
        this.field1840.clear();
        this.field1841.clear();
    }

    @ObfuscatedName("fk.j(Ldl;B)V")
    public void method3067(class109 arg0) {
        if (this.field1835 == null || !this.field1835.method2647()) {
            return;
        }
        byte[] var2 = this.field1835.method2644();
        if (var2 == null) {
            this.method3072();
            this.field1832 = 100;
            return;
        }
        JSONObject var5;
        try {
            class423 var3 = new class423(var2);
            JSONObject var4 = var3.method7207();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method3072();
            this.field1832 = 102;
            return;
        }
        try {
            this.method3069(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1838.clear();
        }
        try {
            this.method3100(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1834.clear();
        }
        try {
            this.method3101(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1828 = null;
            this.field1829[0] = 0.0F;
            this.field1829[1] = 0.0F;
            this.field1829[2] = 1.0F;
            this.field1829[3] = 1.0F;
            this.field1837.clear();
        }
        try {
            this.method3083(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1840.clear();
            this.field1841.clear();
        }
        this.field1832 = this.field1838.size() > 0 ? 1 : 2;
        this.field1835 = null;
    }

    @ObfuscatedName("fk.g(B)V")
    public void method3068() {
        Iterator var1 = this.field1838.iterator();
        class169 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1838.iterator();
                while (var3.hasNext()) {
                    class169 var4 = (class169) var3.next();
                    if (var4.field1868 != null) {
                        byte[] var5 = var4.field1868.method2644();
                        if (var5 != null && var5.length > 0) {
                            this.field1832 = 2;
                            return;
                        }
                    }
                }
                this.method3072();
                this.field1832 = 101;
                return;
            }
            var2 = (class169) var1.next();
        } while (var2.field1868 == null || var2.field1868.method2647());
    }

    @ObfuscatedName("fk.i(Lorg/json/JSONArray;Ldl;I)V")
    public void method3069(JSONArray arg0, class109 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class169 var5 = new class169(this);
                var5.field1868 = arg1.method2608(new URL(var4.getString("src")));
                var5.field1869 = method1986(var4, "placement");
                this.field1838.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("fk.o(Lorg/json/JSONArray;B)V")
    public void method3100(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class170 var4 = new class170(this);
            var4.field1873 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1877 = var7;
            var4.field1878 = method2926(var3.getString("align_y"));
            var4.field1876 = var3.getInt("font");
            var4.field1874 = method1986(var3, "placement");
            this.field1834.add(var4);
        }
    }

    @ObfuscatedName("fk.n(Lorg/json/JSONObject;B)V")
    public void method3101(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1829 = method1986(arg0, "clickbounds");
        this.field1828 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1837.add(new class171(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1837.add(new class171(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1837.add(new class171(this, var2[var3], 0));
                        } else {
                            this.field1837.add(new class163(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("fk.k(Lorg/json/JSONObject;S)V")
    public void method3083(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1840.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1840.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1840.put(var2[var3], 0);
                    } else {
                        this.field1841.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("bu.a(Lorg/json/JSONObject;Ljava/lang/String;I)[F")
    public static float[] method1986(JSONObject arg0, String arg1) throws JSONException {
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

    @ObfuscatedName("eb.s(Ljava/lang/String;I)I")
    public static int method2926(String arg0) {
        if (arg0.equals("centre")) {
            return 1;
        } else if (arg0.equals("bottom") || arg0.equals("right")) {
            return 2;
        } else {
            return 0;
        }
    }
}
