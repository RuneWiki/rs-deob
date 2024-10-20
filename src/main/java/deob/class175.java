package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class175 {

    @ObfuscatedName("gh.ao")
    public class184 field1856;

    @ObfuscatedName("gh.ah")
    public class186 field1854;

    @ObfuscatedName("gh.av")
    public int field1859 = -1;

    @ObfuscatedName("gh.aq")
    public String field1862;

    @ObfuscatedName("gh.ap")
    public String field1860;

    @ObfuscatedName("gh.ae")
    public String field1861;

    @ObfuscatedName("gh.ax")
    public class118 field1855;

    @ObfuscatedName("gh.ay")
    public int field1863 = 0;

    @ObfuscatedName("gh.ak(I)Lhi;")
    public class184 method3235() {
        return this.field1856;
    }

    @ObfuscatedName("gh.al(Ljava/lang/String;Ljava/lang/String;Leb;S)Z")
    public boolean method3236(String arg0, String arg1, class116 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method3297();
            try {
                this.field1862 = arg0;
                this.field1855 = arg2.method2771(new URL(this.field1862));
                this.field1859 = 0;
            } catch (MalformedURLException var5) {
                this.method3297();
                this.field1859 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field1861 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("gh.aj(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3237(String arg0, String arg1, String arg2) {
        this.field1856 = class184.method3361();
        this.field1860 = arg0;
        this.field1856.method3401(this.field1860, arg1, arg2);
    }

    @ObfuscatedName("gh.az(Leb;B)V")
    public void method3238(class116 arg0) {
        switch(this.field1859) {
            case 0:
                this.method3249(arg0);
                break;
            case 1:
                this.method3250();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gh.af(I)I")
    public int method3239() {
        return this.field1859;
    }

    @ObfuscatedName("gh.aa(Ljava/lang/String;I)I")
    public int method3301(String arg0) {
        return this.field1854.field1947.containsKey(arg0) ? (Integer) this.field1854.field1947.get(arg0) : -1;
    }

    @ObfuscatedName("gh.at(Ljava/lang/String;B)Ljava/lang/String;")
    public String method3284(String arg0) {
        return (String) ((String) (this.field1854.field1946.containsKey(arg0) ? this.field1854.field1946.get(arg0) : null));
    }

    @ObfuscatedName("gh.ab(B)Ljava/util/ArrayList;")
    public ArrayList method3242() {
        return this.field1854.field1941;
    }

    @ObfuscatedName("gh.ac(I)Ljava/util/ArrayList;")
    public ArrayList method3292() {
        return this.field1854.field1944;
    }

    @ObfuscatedName("gh.ao(I)Ljava/util/ArrayList;")
    public ArrayList method3244() {
        return this.field1854.field1940;
    }

    @ObfuscatedName("gh.ah(I)Ljava/lang/String;")
    public String method3245() {
        return this.field1854.field1943;
    }

    @ObfuscatedName("gh.av(B)[F")
    public float[] method3288() {
        return this.field1854.field1942;
    }

    @ObfuscatedName("gh.aq(I)Ljava/lang/String;")
    public String method3247() {
        return this.field1854.method3418();
    }

    @ObfuscatedName("gh.ap(B)V")
    public void method3297() {
        this.field1855 = null;
    }

    @ObfuscatedName("gh.ae(Leb;I)V")
    public void method3249(class116 arg0) {
        if (this.field1855 == null || !this.field1855.method2797()) {
            return;
        }
        byte[] var2 = this.field1855.method2798();
        if (var2 == null) {
            this.method3297();
            this.field1859 = 4;
            return;
        }
        try {
            class494 var3 = new class494(var2);
            JSONObject var4 = var3.method8150();
            if (var4 == null) {
                return;
            }
            try {
                this.field1863 = var4.getInt("version");
            } catch (Exception var8) {
                this.method3297();
                this.field1859 = 6;
                return;
            }
            if (this.field1863 < 2) {
                if (!this.field1854.method3410(var4, this.field1863, arg0)) {
                    this.field1859 = 6;
                }
            } else if (this.field1863 == 2) {
                class188 var6 = class188.method6816();
                var6.method3450(var4, this.field1863, arg0);
                this.field1854 = var6.method3460(this.field1861);
                if (this.field1854 == null) {
                    this.field1859 = 7;
                } else {
                    this.method3250();
                    this.field1859 = 1;
                }
            }
        } catch (UnsupportedEncodingException var9) {
            this.method3297();
            this.field1859 = 6;
            return;
        }
        if (this.field1854 != null) {
            this.field1859 = this.field1854.field1941.size() > 0 ? 1 : 2;
        }
        this.field1855 = null;
    }

    @ObfuscatedName("gh.ax(I)V")
    public void method3250() {
        Iterator var1 = this.field1854.field1941.iterator();
        class176 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1854.field1941.iterator();
                while (var3.hasNext()) {
                    class176 var4 = (class176) var3.next();
                    if (var4.field1868 != null) {
                        byte[] var5 = var4.field1868.method2798();
                        if (var5 != null && var5.length > 0) {
                            this.field1859 = 2;
                            return;
                        }
                    }
                }
                this.method3297();
                this.field1859 = 5;
                return;
            }
            var2 = (class176) var1.next();
        } while (var2.field1868 == null || var2.field1868.method2797());
    }

    @ObfuscatedName("gh.ay(Ljava/lang/String;Leb;I)Z")
    public boolean method3277(String arg0, class116 arg1) {
        try {
            JSONObject var3 = (new class494(arg0.getBytes())).method8150();
            try {
                this.field1863 = var3.getInt("version");
            } catch (Exception var6) {
                this.method3297();
                this.field1859 = 6;
                return false;
            }
            if (!this.field1854.method3410(var3, this.field1863, arg1)) {
                this.field1859 = 6;
            }
            this.field1859 = this.field1854.field1941.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field1859 = 6;
        }
        return this.field1859 < 3;
    }
}
