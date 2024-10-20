package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("rb")
public final class class462 {

    @ObfuscatedName("rb.aq")
    public final Comparator field4904;

    @ObfuscatedName("rb.ad")
    public final Map field4901;

    @ObfuscatedName("rb.ag")
    public final class431 field4902;

    @ObfuscatedName("rb.ak")
    public final class431 field4903;

    @ObfuscatedName("rb.ap")
    public final long field4900;

    @ObfuscatedName("rb.an")
    public final class460 field4905;

    @ObfuscatedName("rb.aj")
    public final int field4906;

    public class462(int arg0, class460 arg1) {
        this(-1L, arg0, arg1);
    }

    public class462(long arg0, int arg1, class460 arg2) {
        this.field4904 = new class461(this);
        this.field4900 = arg0;
        this.field4906 = arg1;
        this.field4905 = arg2;
        if (this.field4906 == -1) {
            this.field4901 = new HashMap(64);
            this.field4902 = new class431(64, this.field4904);
            this.field4903 = null;
        } else if (this.field4905 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4901 = new HashMap(this.field4906);
            this.field4902 = new class431(this.field4906, this.field4904);
            this.field4903 = new class431(this.field4906);
        }
    }

    @ObfuscatedName("rb.aq(I)Z")
    public boolean method7739() {
        return this.field4906 != -1;
    }

    @ObfuscatedName("rb.ad(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7728(Object arg0) {
        synchronized (this) {
            if (this.field4900 != -1L) {
                this.method7743();
            }
            class463 var3 = (class463) this.field4901.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7730(var3, false);
                return var3.field4911;
            }
        }
    }

    @ObfuscatedName("rb.ag(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7729(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4900 != -1L) {
                this.method7743();
            }
            class463 var4 = (class463) this.field4901.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4911;
                var4.field4911 = arg1;
                this.method7730(var4, false);
                return var5;
            }
            if (this.method7739() && this.field4901.size() == this.field4906) {
                class463 var6 = (class463) this.field4903.remove();
                this.field4901.remove(var6.field4909);
                this.field4902.remove(var6);
            }
            class463 var7 = new class463(arg1, arg0);
            this.field4901.put(arg0, var7);
            this.method7730(var7, true);
            return null;
        }
    }

    @ObfuscatedName("rb.ak(Lre;ZI)V")
    public void method7730(class463 arg0, boolean arg1) {
        if (!arg1) {
            this.field4902.remove(arg0);
            if (this.method7739() && !this.field4903.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4908 = System.currentTimeMillis();
        if (this.method7739()) {
            switch(this.field4905.field4897) {
                case 0:
                    arg0.field4910 = arg0.field4908;
                    break;
                case 1:
                    arg0.field4910++;
            }
            this.field4903.add(arg0);
        }
        this.field4902.add(arg0);
    }

    @ObfuscatedName("rb.ap(B)V")
    public void method7743() {
        if (this.field4900 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4900;
        while (!this.field4902.isEmpty()) {
            class463 var3 = (class463) this.field4902.peek();
            if (var3.field4908 >= var1) {
                return;
            }
            this.field4901.remove(var3.field4909);
            this.field4902.remove(var3);
            if (this.method7739()) {
                this.field4903.remove(var3);
            }
        }
    }

    @ObfuscatedName("rb.an(B)V")
    public void method7731() {
        synchronized (this) {
            this.field4901.clear();
            this.field4902.clear();
            if (this.method7739()) {
                this.field4903.clear();
            }
        }
    }
}
