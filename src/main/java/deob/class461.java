package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ry")
public final class class461 {

    @ObfuscatedName("ry.ak")
    public final Comparator field4888;

    @ObfuscatedName("ry.al")
    public final Map field4884;

    @ObfuscatedName("ry.aj")
    public final class430 field4885;

    @ObfuscatedName("ry.az")
    public final class430 field4886;

    @ObfuscatedName("ry.af")
    public final long field4887;

    @ObfuscatedName("ry.aa")
    public final class459 field4883;

    @ObfuscatedName("ry.at")
    public final int field4889;

    public class461(int arg0, class459 arg1) {
        this(-1L, arg0, arg1);
    }

    public class461(long arg0, int arg1, class459 arg2) {
        this.field4888 = new class460(this);
        this.field4887 = arg0;
        this.field4889 = arg1;
        this.field4883 = arg2;
        if (this.field4889 == -1) {
            this.field4884 = new HashMap(64);
            this.field4885 = new class430(64, this.field4888);
            this.field4886 = null;
        } else if (this.field4883 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4884 = new HashMap(this.field4889);
            this.field4885 = new class430(this.field4889, this.field4888);
            this.field4886 = new class430(this.field4889);
        }
    }

    @ObfuscatedName("ry.ak(I)Z")
    public boolean method7766() {
        return this.field4889 != -1;
    }

    @ObfuscatedName("ry.al(Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7767(Object arg0) {
        synchronized (this) {
            if (this.field4887 != -1L) {
                this.method7770();
            }
            class462 var3 = (class462) this.field4884.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7780(var3, false);
                return var3.field4893;
            }
        }
    }

    @ObfuscatedName("ry.aj(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7772(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4887 != -1L) {
                this.method7770();
            }
            class462 var4 = (class462) this.field4884.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4893;
                var4.field4893 = arg1;
                this.method7780(var4, false);
                return var5;
            }
            if (this.method7766() && this.field4884.size() == this.field4889) {
                class462 var6 = (class462) this.field4886.remove();
                this.field4884.remove(var6.field4891);
                this.field4885.remove(var6);
            }
            class462 var7 = new class462(arg1, arg0);
            this.field4884.put(arg0, var7);
            this.method7780(var7, true);
            return null;
        }
    }

    @ObfuscatedName("ry.az(Lrp;ZI)V")
    public void method7780(class462 arg0, boolean arg1) {
        if (!arg1) {
            this.field4885.remove(arg0);
            if (this.method7766() && !this.field4886.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4892 = System.currentTimeMillis();
        if (this.method7766()) {
            switch(this.field4883.field4876) {
                case 0:
                    arg0.field4890++;
                    break;
                case 1:
                    arg0.field4890 = arg0.field4892;
            }
            this.field4886.add(arg0);
        }
        this.field4885.add(arg0);
    }

    @ObfuscatedName("ry.af(I)V")
    public void method7770() {
        if (this.field4887 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4887;
        while (!this.field4885.isEmpty()) {
            class462 var3 = (class462) this.field4885.peek();
            if (var3.field4892 >= var1) {
                return;
            }
            this.field4884.remove(var3.field4891);
            this.field4885.remove(var3);
            if (this.method7766()) {
                this.field4886.remove(var3);
            }
        }
    }

    @ObfuscatedName("ry.aa(B)V")
    public void method7775() {
        synchronized (this) {
            this.field4884.clear();
            this.field4885.clear();
            if (this.method7766()) {
                this.field4886.clear();
            }
        }
    }
}
