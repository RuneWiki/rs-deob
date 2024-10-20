package deob;

import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

@ObfuscatedName("gp")
public class class181 {

    @ObfuscatedName("gp.az")
    public String field1910 = "";

    @ObfuscatedName("gp.ah")
    public String field1914 = "";

    @ObfuscatedName("gp.af")
    public String field1917 = "";

    @ObfuscatedName("gp.at")
    public String field1907 = "";

    @ObfuscatedName("gp.an")
    public long field1908 = -1L;

    @ObfuscatedName("gp.ao")
    public class15 field1904;

    @ObfuscatedName("gp.ab")
    public class19 field1905;

    @ObfuscatedName("gp.aw")
    public final int field1911 = 1;

    @ObfuscatedName("gp.ad")
    public final int field1912 = 2;

    @ObfuscatedName("gp.al")
    public int field1913 = 1;

    @ObfuscatedName("gp.ar")
    public int field1916 = 0;

    @ObfuscatedName("gp.aj")
    public String field1906;

    @ObfuscatedName("gp.au")
    public static final class181 field1918 = new class181();

    @ObfuscatedName("gp.ay")
    public boolean field1919;

    @ObfuscatedName("ej.az(I)Lgp;")
    public static class181 method2555() {
        return field1918;
    }

    @ObfuscatedName("gp.ah(ILjava/lang/String;I)V")
    public void method3272(int arg0, String arg1) {
        this.field1916 = arg0;
        this.field1906 = arg1;
    }

    @ObfuscatedName("gp.af(ZI)V")
    public void method3285(boolean arg0) {
        this.field1919 = arg0;
        this.field1904 = new class15("crmsession", 1, 1);
    }

    @ObfuscatedName("gp.at(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public void method3278(String arg0, String arg1, String arg2) {
        if (this.field1913 == 2) {
            return;
        }
        this.field1910 = arg0;
        this.field1914 = arg1;
        this.field1917 = arg2;
        if (!this.field1910.endsWith("/")) {
            this.field1910 = this.field1910 + "/";
        }
        if (this.field1914.equals("")) {
            return;
        }
        String var4 = this.field1910;
        String var5 = var4 + "session/open/" + this.field1914;
        if (this.field1917.equals("")) {
        }
        String var6 = var5 + "?userHash=" + this.field1917;
        try {
            this.field1905 = this.method3254(var6);
            this.field1908 = class318.method3596();
        } catch (IOException var8) {
            this.field1905 = null;
            this.field1914 = "";
            this.field1917 = "";
        }
    }

    @ObfuscatedName("gp.an(I)V")
    public void method3261() {
        if (this.field1905 != null || this.field1907.isEmpty() || this.field1913 != 1) {
            return;
        }
        long var1 = class318.method3596();
        long var3 = var1 - this.field1908;
        String var5 = this.field1910;
        String var6 = var5 + "session/close/" + this.field1914 + "/" + this.field1907;
        String var7;
        if (this.field1917.isEmpty()) {
            var7 = var6 + "?sessionDuration=" + var3;
        } else {
            var7 = var6 + "?userHash=" + this.field1917 + "&sessionDuration=" + var3;
        }
        try {
            this.field1905 = this.method3254(var7);
        } catch (IOException var9) {
            this.field1913 = 1;
        }
    }

    @ObfuscatedName("gp.ao(I)V")
    public void method3257() {
        if (this.field1904 != null) {
            this.field1904.method177();
        }
    }

    @ObfuscatedName("gp.ab(I)V")
    public void method3258() {
        if (this.field1907.isEmpty()) {
            return;
        }
        String var1 = "";
        switch(this.field1916) {
            case 1:
                var1 = "events/click";
                break;
            case 2:
                var1 = "events/dismissed";
                break;
            case 3:
                var1 = "events/impression";
        }
        if (this.field1906.isEmpty()) {
            return;
        }
        String var2 = this.field1910;
        String var3 = var2 + var1 + "/" + this.field1914 + "/" + this.field1907 + "/" + this.field1906 + "?userHash=" + this.field1917;
        try {
            this.field1905 = this.method3254(var3);
        } catch (IOException var5) {
            this.field1913 = 1;
        }
        this.field1913 = 1;
        this.field1916 = 0;
    }

    @ObfuscatedName("gp.aw(I)V")
    public void method3259() {
        if (this.field1905 == null || !this.field1905.method254()) {
            return;
        }
        if (this.field1905.method254() && this.field1905.method255().method268() == 200 && this.field1907.isEmpty()) {
            String var1 = this.field1905.method255().method270();
            if (var1.isEmpty()) {
                return;
            }
            this.field1907 = var1;
        }
        if (this.field1916 != 0) {
            this.method3258();
        }
    }

    @ObfuscatedName("gp.ad(Ljava/lang/String;I)Z")
    public boolean method3260(String arg0) {
        this.method3272(2, arg0);
        return true;
    }

    @ObfuscatedName("gp.al(Ljava/lang/String;I)Lap;")
    public class19 method3254(String arg0) throws IOException {
        URL var2 = new URL(arg0);
        class11 var3 = new class11(var2, class10.field31, this.field1919);
        try {
            JSONObject var4 = new JSONObject();
            var3.method83(new class483(var4));
        } catch (Exception var6) {
        }
        return this.field1904.method170(var3);
    }
}
