package deob;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class172 {

    @ObfuscatedName("gh.al")
    public class181 field1844;

    @ObfuscatedName("gh.as")
    public class183 field1846;

    @ObfuscatedName("gh.ag")
    public int field1850 = -1;

    @ObfuscatedName("gh.ai")
    public String field1851;

    @ObfuscatedName("gh.ax")
    public String field1852;

    @ObfuscatedName("gh.ar")
    public String field1853;

    @ObfuscatedName("gh.aj")
    public class116 field1854;

    @ObfuscatedName("gh.au")
    public int field1848 = 0;

    @ObfuscatedName("gh.az(B)Lgp;")
    public class181 method3146() {
        return this.field1844;
    }

    @ObfuscatedName("gh.ah(Ljava/lang/String;Ljava/lang/String;Lea;B)Z")
    public boolean method3147(String arg0, String arg1, class114 arg2) {
        if (arg0 == null || arg0.isEmpty()) {
            return false;
        } else if (arg2 == null) {
            return false;
        } else {
            this.method3159();
            try {
                this.field1851 = arg0;
                this.field1854 = arg2.method2677(new URL(this.field1851));
                this.field1850 = 0;
            } catch (MalformedURLException var5) {
                this.method3159();
                this.field1850 = 4;
                return false;
            }
            if (!arg1.isEmpty()) {
                this.field1853 = arg1;
            }
            return true;
        }
    }

    @ObfuscatedName("gh.af(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public void method3148(String arg0, String arg1, String arg2) {
        this.field1844 = class181.method2555();
        this.field1852 = arg0;
        this.field1844.method3278(this.field1852, arg1, arg2);
    }

    @ObfuscatedName("gh.at(Lea;I)V")
    public void method3187(class114 arg0) {
        switch(this.field1850) {
            case 0:
                this.method3157(arg0);
                break;
            case 1:
                this.method3195();
                break;
            default:
                return;
        }
    }

    @ObfuscatedName("gh.an(I)I")
    public int method3150() {
        return this.field1850;
    }

    @ObfuscatedName("gh.ao(Ljava/lang/String;I)I")
    public int method3161(String arg0) {
        return this.field1846.field1936.containsKey(arg0) ? (Integer) this.field1846.field1936.get(arg0) : -1;
    }

    @ObfuscatedName("gh.ab(Ljava/lang/String;I)Ljava/lang/String;")
    public String method3152(String arg0) {
        return (String) ((String) (this.field1846.field1937.containsKey(arg0) ? this.field1846.field1937.get(arg0) : null));
    }

    @ObfuscatedName("gh.aw(I)Ljava/util/ArrayList;")
    public ArrayList method3196() {
        return this.field1846.field1932;
    }

    @ObfuscatedName("gh.ad(I)Ljava/util/ArrayList;")
    public ArrayList method3154() {
        return this.field1846.field1931;
    }

    @ObfuscatedName("gh.al(B)Ljava/util/ArrayList;")
    public ArrayList method3155() {
        return this.field1846.field1935;
    }

    @ObfuscatedName("gh.as(I)Ljava/lang/String;")
    public String method3156() {
        return this.field1846.field1933;
    }

    @ObfuscatedName("gh.ag(B)[F")
    public float[] method3190() {
        return this.field1846.field1928;
    }

    @ObfuscatedName("gh.ai(I)Ljava/lang/String;")
    public String method3158() {
        return this.field1846.method3293();
    }

    @ObfuscatedName("gh.ax(B)V")
    public void method3159() {
        this.field1854 = null;
    }

    @ObfuscatedName("gh.ar(Lea;B)V")
    public void method3157(class114 arg0) {
        if (this.field1854 == null || !this.field1854.method2712()) {
            return;
        }
        byte[] var2 = this.field1854.method2714();
        if (var2 == null) {
            this.method3159();
            this.field1850 = 4;
            return;
        }
        try {
            class483 var3 = new class483(var2);
            JSONObject var4 = var3.method7816();
            if (var4 == null) {
                return;
            }
            try {
                this.field1848 = var4.getInt("version");
            } catch (Exception var8) {
                this.method3159();
                this.field1850 = 6;
                return;
            }
            if (this.field1848 < 2) {
                if (!this.field1846.method3328(var4, this.field1848, arg0)) {
                    this.field1850 = 6;
                }
            } else if (this.field1848 == 2) {
                class185 var6 = class185.method6544();
                var6.method3338(var4, this.field1848, arg0);
                this.field1846 = var6.method3341(this.field1853);
                if (this.field1846 == null) {
                    this.field1850 = 7;
                } else {
                    this.method3195();
                    this.field1850 = 1;
                }
            }
        } catch (UnsupportedEncodingException var9) {
            this.method3159();
            this.field1850 = 6;
            return;
        }
        if (this.field1846 != null) {
            this.field1850 = this.field1846.field1932.size() > 0 ? 1 : 2;
        }
        this.field1854 = null;
    }

    @ObfuscatedName("gh.aj(B)V")
    public void method3195() {
        Iterator var1 = this.field1846.field1932.iterator();
        class173 var2;
        do {
            if (!var1.hasNext()) {
                Iterator var3 = this.field1846.field1932.iterator();
                while (var3.hasNext()) {
                    class173 var4 = (class173) var3.next();
                    if (var4.field1860 != null) {
                        byte[] var5 = var4.field1860.method2714();
                        if (var5 != null && var5.length > 0) {
                            this.field1850 = 2;
                            return;
                        }
                    }
                }
                this.method3159();
                this.field1850 = 5;
                return;
            }
            var2 = (class173) var1.next();
        } while (var2.field1860 == null || var2.field1860.method2712());
    }

    @ObfuscatedName("gh.au(Ljava/lang/String;Lea;I)Z")
    public boolean method3165(String arg0, class114 arg1) {
        try {
            JSONObject var3 = (new class483(arg0.getBytes())).method7816();
            try {
                this.field1848 = var3.getInt("version");
            } catch (Exception var6) {
                this.method3159();
                this.field1850 = 6;
                return false;
            }
            if (!this.field1846.method3328(var3, this.field1848, arg1)) {
                this.field1850 = 6;
            }
            this.field1850 = this.field1846.field1932.size() > 0 ? 1 : 2;
        } catch (UnsupportedEncodingException var7) {
            this.field1850 = 6;
        }
        return this.field1850 < 3;
    }
}
