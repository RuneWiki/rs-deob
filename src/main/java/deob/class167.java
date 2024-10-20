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

@ObfuscatedName("fs")
public class class167 {

    @ObfuscatedName("fs.l")
    public int field1820 = -1;

    @ObfuscatedName("fs.k")
    public String field1821;

    @ObfuscatedName("fs.c")
    public class110 field1827;

    @ObfuscatedName("fs.r")
    public String field1828 = null;

    @ObfuscatedName("fs.b")
    public float[] field1829 = new float[4];

    @ObfuscatedName("fs.m")
    public ArrayList field1830 = new ArrayList();

    @ObfuscatedName("fs.t")
    public ArrayList field1831 = new ArrayList();

    @ObfuscatedName("fs.h")
    public ArrayList field1832 = new ArrayList();

    @ObfuscatedName("fs.p")
    public Map field1825 = new HashMap();

    @ObfuscatedName("fs.o")
    public Map field1834 = new HashMap();

    @ObfuscatedName("fs.f(Ljava/lang/String;Ldi;I)Z")
    public boolean method3163(String arg0, class108 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3171();
            try {
                this.field1821 = arg0;
                this.field1827 = arg1.method2721(new URL(this.field1821));
                this.field1820 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3171();
                this.field1820 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("fs.w(Ldi;I)V")
    public void method3164(class108 arg0) {
        switch(this.field1820) {
            case 0:
                this.method3172(arg0);
                break;
            case 1:
                this.method3173();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("fs.v(I)I")
    public int method3165() {
        return this.field1820;
    }

    @ObfuscatedName("fs.s(Ljava/lang/String;I)I")
    public int method3178(String arg0) {
        return this.field1825.containsKey(arg0) ? (Integer) this.field1825.get(arg0) : -1;
    }

    @ObfuscatedName("fs.z(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3167(String arg0) {
        return (String) ((String) (this.field1834.containsKey(arg0) ? this.field1834.get(arg0) : null));
    }

    @ObfuscatedName("fs.j(I)Ljava/util/ArrayList;")
    public ArrayList method3204() {
        return this.field1831;
    }

    @ObfuscatedName("fs.i(I)Ljava/util/ArrayList;")
    public ArrayList method3169() {
        return this.field1832;
    }

    @ObfuscatedName("fs.n(I)Ljava/lang/String;")
    public String method3170() {
        return this.field1828;
    }

    @ObfuscatedName("fs.l(B)Ljava/util/ArrayList;")
    public ArrayList method3193() {
        return this.field1830;
    }

    @ObfuscatedName("fs.k(I)V")
    public void method3171() {
        this.field1827 = null;
        this.field1828 = null;
        this.field1829[0] = 0.0F;
        this.field1829[1] = 0.0F;
        this.field1829[2] = 1.0F;
        this.field1829[3] = 1.0F;
        this.field1830.clear();
        this.field1831.clear();
        this.field1832.clear();
        this.field1825.clear();
        this.field1834.clear();
    }

    @ObfuscatedName("fs.c(Ldi;I)V")
    public void method3172(class108 arg0) {
        if (this.field1827 == null || !this.field1827.method2747()) {
            return;
        }
        byte[] var2 = this.field1827.method2758();
        if (var2 == null) {
            this.method3171();
            this.field1820 = 100;
            return;
        }
        JSONObject var5;
        try {
            class430 var3 = new class430(var2);
            JSONObject var4 = var3.method7411();
            var5 = var4.getJSONObject("message");
        } catch (Exception var15) {
            this.method3171();
            this.field1820 = 102;
            return;
        }
        try {
            this.method3174(var5.getJSONArray("images"), arg0);
        } catch (Exception var14) {
            this.field1831.clear();
        }
        try {
            this.method3175(var5.getJSONArray("labels"));
        } catch (Exception var13) {
            this.field1832.clear();
        }
        try {
            this.method3208(var5.getJSONObject("behaviour"));
        } catch (Exception var12) {
            this.field1828 = null;
            this.field1829[0] = 0.0F;
            this.field1829[1] = 0.0F;
            this.field1829[2] = 1.0F;
            this.field1829[3] = 1.0F;
            this.field1830.clear();
        }
        try {
            this.method3212(var5.getJSONObject("meta"));
        } catch (Exception var11) {
            this.field1825.clear();
            this.field1834.clear();
        }
        this.field1820 = this.field1831.size() > 0 ? 1 : 2;
        this.field1827 = null;
    }

    @ObfuscatedName("fs.r(I)V")
    public void method3173() {
        Iterator var1 = this.field1831.iterator();
        class173 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1831.iterator();
                while (var3.hasNext()) {
                    class173 var4 = (class173) var3.next();
                    if (var4.field1871 != null) {
                        byte[] var5 = var4.field1871.method2758();
                        if (var5 != null && var5.length > 0) {
                            this.field1820 = 2;
                            return;
                        }
                    }
                }
                this.method3171();
                this.field1820 = 101;
                return;
            }
            var2 = (class173) var1.next();
        } while (var2.field1871 == null || var2.field1871.method2747());
    }

    @ObfuscatedName("fs.b(Lorg/json/JSONArray;Ldi;I)V")
    public void method3174(JSONArray arg0, class108 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class173 var5 = new class173(this);
                var5.field1871 = arg1.method2721(new URL(var4.getString("src")));
                var5.field1865 = method2296(var4, "placement");
                this.field1831.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("fs.m(Lorg/json/JSONArray;I)V")
    public void method3175(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class174 var4 = new class174(this);
            var4.field1876 = var3.getString("text");
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
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1879 = var10;
            var4.field1880 = var3.getInt("font");
            var4.field1881 = method2296(var3, "placement");
            this.field1832.add(var4);
        }
    }

    @ObfuscatedName("fs.t(Lorg/json/JSONObject;I)V")
    public void method3208(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1829 = method2296(arg0, "clickbounds");
        this.field1828 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1830.add(new class175(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1830.add(new class175(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1830.add(new class175(this, var2[var3], 0));
                        } else {
                            this.field1830.add(new class166(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("fs.h(Lorg/json/JSONObject;I)V")
    public void method3212(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1825.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1825.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1825.put(var2[var3], 0);
                    } else {
                        this.field1834.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("cx.p(Lorg/json/JSONObject;Ljava/lang/String;B)[F")
    public static float[] method2296(JSONObject arg0, String arg1) throws JSONException {
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
