package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("hi")
public class class184 {

    @ObfuscatedName("hi.ak")
    public String field1920 = "";

    @ObfuscatedName("hi.al")
    public String field1913 = "";

    @ObfuscatedName("hi.aj")
    public String field1921 = "";

    @ObfuscatedName("hi.az")
    public String field1915 = "";

    @ObfuscatedName("hi.af")
    public long field1916 = -1L;

    @ObfuscatedName("hi.aa")
    public class15 field1927;

    @ObfuscatedName("hi.at")
    public class19 field1914;

    @ObfuscatedName("hi.ab")
    public final int field1919 = 1;

    @ObfuscatedName("hi.ac")
    public final int field1924 = 2;

    @ObfuscatedName("hi.ao")
    public int field1918 = 1;

    @ObfuscatedName("hi.ae")
    public int field1922 = 0;

    @ObfuscatedName("hi.ax")
    public String field1923;

    @ObfuscatedName("hi.ay")
    public static final class184 field1912 = new class184();

    @ObfuscatedName("hi.au")
    public boolean field1925;

    @ObfuscatedName("gp.ak(I)Lhi;")
    public static class184 method3361() {
        return field1912;
    }

    @ObfuscatedName("hi.al(ILjava/lang/String;I)V")
    public void method3369(int arg0, String arg1) {
        this.field1922 = arg0;
        this.field1923 = arg1;
    }

    @ObfuscatedName("hi.aj(ZB)V")
    public void method3370(boolean arg0) {
        this.field1925 = arg0;
        this.field1927 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("hi.az(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3401(String arg0, String arg1, String arg2) {
        if (this.field1918 == 2) {
            return;
        }
        this.field1920 = arg0;
        this.field1913 = arg1;
        this.field1921 = arg2;
        if (!this.field1920.endsWith("/")) {
            this.field1920 = this.field1920 + "/";
        }
        if (this.field1913.equals("")) {
            return;
        }
        String var4 = this.field1920;
        String var5 = var4 + "session/open/" + this.field1913;
        if (this.field1921.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field1921;
        try {
            this.field1914 = this.method3378(var6);
            this.field1916 = class326.method2895();
        } catch (IOException var8) {
            this.field1914 = null;
            this.field1913 = "";
            this.field1921 = "";
        }
    }

    @ObfuscatedName("hi.af(B)V")
    public void method3372() {
        if (this.field1914 != null || this.field1915.isEmpty() || this.field1918 != 1) {
            return;
        }
        long var1 = class326.method2895();
        long var3 = var1 - this.field1916;
        String var5 = this.field1920;
        String var6 = var5 + "session/close/" + this.field1913 + "/" + this.field1915;
        String var7;
        if (this.field1921.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field1921 + "&sessionDuration=" + var3;
        }
        try {
            this.field1914 = this.method3378(var7);
        } catch (IOException var9) {
            this.field1918 = 1;
        }
    }

    @ObfuscatedName("hi.aa(B)V")
    public void method3375() {
        if (this.field1927 != null) {
            this.field1927.method168();
        }
    }

    @ObfuscatedName("hi.at(I)V")
    public void method3374() {
        if (this.field1915.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field1922) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field1923.isEmpty()) {
            return;
        }
        String var2 = this.field1920;
        String var3 = var2 + var1 + "/" + this.field1913 + "/" + this.field1915 + "/" + this.field1923 + "?userHash=" + this.field1921;
        try {
            this.field1914 = this.method3378(var3);
        } catch (IOException var5) {
            this.field1918 = 1;
        }
        this.field1918 = 1;
        this.field1922 = 0;
    }

    @ObfuscatedName("hi.ab(I)V")
    public void method3381() {
        if (this.field1914 == null || !this.field1914.method248()) {
            return;
        }
        if (this.field1914.method248() && this.field1914.method254().method265() == 200 && this.field1915.isEmpty()) {
            String var1 = this.field1914.method254().method267();
            if (var1.isEmpty()) {
                return;
            }
            this.field1915 = var1;
        }
        if (this.field1922 != 0) {
            this.method3374();
        }
    }

    @ObfuscatedName("hi.ac(Ljava/lang/String;B)Z")
    public boolean method3393(String arg0) {
        this.method3369(2, arg0);
        return true;
    }

    @ObfuscatedName("hi.ao(Ljava/lang/String;I)Las;")
    public class19 method3378(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field36, this.field1925);
        try {
            JSONObject var4 = new JSONObject();
            var3.method91(new class494(var4));
        } catch (Exception var6) {
        }
        return this.field1927.method165(var3);
    }
}
