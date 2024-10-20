package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("rs")
public final class class466 {

    @ObfuscatedName("rs.ap")
    public final Comparator field4969;

    @ObfuscatedName("rs.aw")
    public final Map field4965;

    @ObfuscatedName("rs.ak")
    public final class435 field4964;

    @ObfuscatedName("rs.aj")
    public final class435 field4966;

    @ObfuscatedName("rs.ai")
    public final long field4968;

    @ObfuscatedName("rs.ay")
    public final class464 field4967;

    @ObfuscatedName("rs.as")
    public final int field4970;

    public class466(int arg0, class464 arg1) {
        this(-1L, arg0, arg1);
    }

    public class466(long arg0, int arg1, class464 arg2) {
        this.field4969 = new class465(this);
        this.field4968 = arg0;
        this.field4970 = arg1;
        this.field4967 = arg2;
        if (this.field4970 == -1) {
            this.field4965 = new HashMap(64);
            this.field4964 = new class435(64, this.field4969);
            this.field4966 = null;
        } else if (this.field4967 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4965 = new HashMap(this.field4970);
            this.field4964 = new class435(this.field4970, this.field4969);
            this.field4966 = new class435(this.field4970);
        }
    }

    @ObfuscatedName("rs.ap(I)Z")
    public boolean method8227() {
        return this.field4970 != -1;
    }

    @ObfuscatedName("rs.aw(Ljava/lang/Object;S)Ljava/lang/Object;")
    public Object method8225(Object arg0) {
        synchronized (this) {
            if (this.field4968 != -1L) {
                this.method8230();
            }
            class467 var3 = (class467) this.field4965.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method8229(var3, false);
                return var3.field4971;
            }
        }
    }

    @ObfuscatedName("rs.ak(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method8228(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4968 != -1L) {
                this.method8230();
            }
            class467 var4 = (class467) this.field4965.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4971;
                var4.field4971 = arg1;
                this.method8229(var4, false);
                return var5;
            }
            if (this.method8227() && this.field4965.size() == this.field4970) {
                class467 var6 = (class467) this.field4966.remove();
                this.field4965.remove(var6.field4972);
                this.field4964.remove(var6);
            }
            class467 var7 = new class467(arg1, arg0);
            this.field4965.put(arg0, var7);
            this.method8229(var7, true);
            return null;
        }
    }

    @ObfuscatedName("rs.aj(Lrw;ZI)V")
    public void method8229(class467 arg0, boolean arg1) {
        if (!arg1) {
            this.field4964.remove(arg0);
            if (this.method8227() && !this.field4966.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4975 = System.currentTimeMillis();
        if (this.method8227()) {
            switch(this.field4967.field4960) {
                case 0:
                    arg0.field4974++;
                    break;
                case 1:
                    arg0.field4974 = arg0.field4975;
            }
            this.field4966.add(arg0);
        }
        this.field4964.add(arg0);
    }

    @ObfuscatedName("rs.ai(I)V")
    public void method8230() {
        if (this.field4968 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4968;
        while (!this.field4964.isEmpty()) {
            class467 var3 = (class467) this.field4964.peek();
            if (var3.field4975 >= var1) {
                return;
            }
            this.field4965.remove(var3.field4972);
            this.field4964.remove(var3);
            if (this.method8227()) {
                this.field4966.remove(var3);
            }
        }
    }

    @ObfuscatedName("rs.ay(I)V")
    public void method8231() {
        synchronized (this) {
            this.field4965.clear();
            this.field4964.clear();
            if (this.method8227()) {
                this.field4966.clear();
            }
        }
    }
}
