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

@ObfuscatedName("gf")
public class class171 {

    @ObfuscatedName("gf.aa")
    public int field1838 = -1;

    @ObfuscatedName("gf.af")
    public String field1839;

    @ObfuscatedName("gf.ad")
    public class115 field1840;

    @ObfuscatedName("gf.aq")
    public String field1841 = null;

    @ObfuscatedName("gf.al")
    public float[] field1842 = new float[4];

    @ObfuscatedName("gf.an")
    public ArrayList field1837 = new ArrayList();

    @ObfuscatedName("gf.ar")
    public ArrayList field1845 = new ArrayList();

    @ObfuscatedName("gf.ab")
    public ArrayList field1835 = new ArrayList();

    @ObfuscatedName("gf.ag")
    public Map field1846 = new HashMap();

    @ObfuscatedName("gf.am")
    public Map field1847 = new HashMap();

    @ObfuscatedName("gf.au(Ljava/lang/String;Lev;I)Z")
    public boolean method3125(String arg0, class113 arg1) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg1 == null) {
            return false;
        } else {
            this.method3135();
            try {
                this.field1839 = arg0;
                this.field1840 = arg1.method2691(new URL(this.field1839));
                this.field1838 = 0;
                return true;
            } catch (MalformedURLException var4) {
                this.method3135();
                this.field1838 = 100;
                return false;
            }
        }
    }

    @ObfuscatedName("gf.ae(Lev;I)V")
    public void method3173(class113 arg0) {
        switch(this.field1838) {
            case 0:
                this.method3136(arg0);
                break;
            case 1:
                this.method3137();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gf.ao(I)I")
    public int method3127() {
        return this.field1838;
    }

    @ObfuscatedName("gf.at(Ljava/lang/String;I)I")
    public int method3128(String arg0) {
        return this.field1846.containsKey(arg0) ? (Integer) this.field1846.get(arg0) : -1;
    }

    @ObfuscatedName("gf.ac(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3177(String arg0) {
        return (String) ((String) (this.field1847.containsKey(arg0) ? this.field1847.get(arg0) : null));
    }

    @ObfuscatedName("gf.ai(B)Ljava/util/ArrayList;")
    public ArrayList method3130() {
        return this.field1845;
    }

    @ObfuscatedName("gf.az(B)Ljava/util/ArrayList;")
    public ArrayList method3178() {
        return this.field1835;
    }

    @ObfuscatedName("gf.ap(I)Ljava/lang/String;")
    public String method3132() {
        return this.field1841;
    }

    @ObfuscatedName("gf.aa(I)[F")
    public float[] method3131() {
        return this.field1842;
    }

    @ObfuscatedName("gf.af(B)Ljava/util/ArrayList;")
    public ArrayList method3134() {
        return this.field1837;
    }

    @ObfuscatedName("gf.ad(B)V")
    public void method3135() {
        this.field1840 = null;
        this.field1841 = null;
        this.field1842[0] = 0.0F;
        this.field1842[1] = 0.0F;
        this.field1842[2] = 1.0F;
        this.field1842[3] = 1.0F;
        this.field1837.clear();
        this.field1845.clear();
        this.field1835.clear();
        this.field1846.clear();
        this.field1847.clear();
    }

    @ObfuscatedName("gf.aq(Lev;B)V")
    public void method3136(class113 arg0) {
        if (this.field1840 == null || !this.field1840.method2722()) {
            return;
        }
        byte[] var2 = this.field1840.method2728();
        if (var2 == null) {
            this.method3135();
            this.field1838 = 100;
            return;
        }
        try {
            this.method3142(new class463(var2), arg0);
        } catch (UnsupportedEncodingException var4) {
            this.method3135();
            this.field1838 = 102;
            return;
        }
        this.field1838 = this.field1845.size() > 0 ? 1 : 2;
        this.field1840 = null;
    }

    @ObfuscatedName("gf.al(I)V")
    public void method3137() {
        Iterator var1 = this.field1845.iterator();
        class177 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1845.iterator();
                while (var3.hasNext()) {
                    class177 var4 = (class177) var3.next();
                    if (var4.field1880 != null) {
                        byte[] var5 = var4.field1880.method2728();
                        if (var5 != null && var5.length > 0) {
                            this.field1838 = 2;
                            return;
                        }
                    }
                }
                this.method3135();
                this.field1838 = 101;
                return;
            }
            var2 = (class177) var1.next();
        } while (var2.field1880 == null || var2.field1880.method2722());
    }

    @ObfuscatedName("gf.an(Lorg/json/JSONArray;Lev;B)V")
    public void method3175(JSONArray arg0, class113 arg1) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                JSONObject var4 = arg0.getJSONObject(var3);
                class177 var5 = new class177(this);
                var5.field1880 = arg1.method2691(new URL(var4.getString("src")));
                var5.field1881 = method2764(var4, "placement");
                this.field1845.add(var5);
            } catch (MalformedURLException var7) {
            }
        }
    }

    @ObfuscatedName("gf.ar(Lorg/json/JSONArray;I)V")
    public void method3139(JSONArray arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var2 = 0; var2 < arg0.length(); var2++) {
            JSONObject var3 = arg0.getJSONObject(var2);
            class178 var4 = new class178(this);
            var4.field1893 = var3.getString("text");
            String var6 = var3.getString("align_x");
            byte var7;
            if (var6.equals("centre")) {
                var7 = 1;
            } else if (var6.equals("bottom") || var6.equals("right")) {
                var7 = 2;
            } else {
                var7 = 0;
            }
            var4.field1887 = var7;
            String var9 = var3.getString("align_y");
            byte var10;
            if (var9.equals("centre")) {
                var10 = 1;
            } else if (var9.equals("bottom") || var9.equals("right")) {
                var10 = 2;
            } else {
                var10 = 0;
            }
            var4.field1888 = var10;
            var4.field1885 = var3.getInt("font");
            var4.field1886 = method2764(var3, "placement");
            this.field1835.add(var4);
        }
    }

    @ObfuscatedName("gf.ab(Lorg/json/JSONObject;I)V")
    public void method3157(JSONObject arg0) throws JSONException {
        if (arg0 == null) {
            return;
        }
        this.field1842 = method2764(arg0, "clickbounds");
        this.field1841 = arg0.getString("endpoint");
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
                try {
                    int var4 = arg0.getInt(var2[var3]);
                    this.field1837.add(new class179(this, var2[var3], var4));
                } catch (Exception var9) {
                    try {
                        String var6 = arg0.getString(var2[var3]);
                        if (var6.equals("true")) {
                            this.field1837.add(new class179(this, var2[var3], 1));
                        } else if (var6.equals("false")) {
                            this.field1837.add(new class179(this, var2[var3], 0));
                        } else {
                            this.field1837.add(new class170(this, var2[var3], var6));
                        }
                    } catch (Exception var8) {
                    }
                }
            }
        }
    }

    @ObfuscatedName("gf.ag(Lorg/json/JSONObject;B)V")
    public void method3199(JSONObject arg0) throws JSONException {
        String[] var2 = JSONObject.getNames(arg0);
        for (int var3 = 0; var3 < arg0.length(); var3++) {
            try {
                int var4 = arg0.getInt(var2[var3]);
                this.field1846.put(var2[var3], var4);
            } catch (Exception var9) {
                try {
                    String var6 = arg0.getString(var2[var3]);
                    if (var6.equals("true")) {
                        this.field1846.put(var2[var3], 1);
                    } else if (var6.equals("false")) {
                        this.field1846.put(var2[var3], 0);
                    } else {
                        this.field1847.put(var2[var3], var6);
                    }
                } catch (Exception var8) {
                }
            }
        }
    }

    @ObfuscatedName("gf.am(Lrl;Lev;B)V")
    public void method3142(class463 arg0, class113 arg1) {
        JSONObject var4;
        try {
            JSONObject var3 = arg0.method7652();
            var4 = var3.getJSONObject("message");
        } catch (Exception var14) {
            this.method3135();
            this.field1838 = 102;
            return;
        }
        try {
            this.method3175(var4.getJSONArray("images"), arg1);
        } catch (Exception var13) {
            this.field1845.clear();
        }
        try {
            this.method3139(var4.getJSONArray("labels"));
        } catch (Exception var12) {
            this.field1835.clear();
        }
        try {
            this.method3157(var4.getJSONObject("behaviour"));
        } catch (Exception var11) {
            this.field1841 = null;
            this.field1842[0] = 0.0F;
            this.field1842[1] = 0.0F;
            this.field1842[2] = 1.0F;
            this.field1842[3] = 1.0F;
            this.field1837.clear();
        }
        try {
            this.method3199(var4.getJSONObject("meta"));
        } catch (Exception var10) {
            this.field1846.clear();
            this.field1847.clear();
        }
    }

    @ObfuscatedName("gf.ax(Ljava/lang/String;Lev;I)Z")
    public boolean method3143(String arg0, class113 arg1) {
        try {
            this.method3142(new class463(arg0.getBytes()), arg1);
            this.field1838 = this.field1845.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var4) {
            this.field1838 = 102;
        }
        return this.field1838 < 100;
    }

    @ObfuscatedName("es.ah(Lorg/json/JSONObject;Ljava/lang/String;S)[F")
    public static float[] method2764(JSONObject arg0, String arg1) throws JSONException {
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
