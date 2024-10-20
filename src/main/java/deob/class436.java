package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("qc")
public final class class436 {

    @ObfuscatedName("qc.at")
    public final Comparator field4655;

    @ObfuscatedName("qc.ah")
    public final Map field4653;

    @ObfuscatedName("qc.ar")
    public final class405 field4651;

    @ObfuscatedName("qc.ao")
    public final class405 field4652;

    @ObfuscatedName("qc.ab")
    public final long field4650;

    @ObfuscatedName("qc.au")
    public final class434 field4654;

    @ObfuscatedName("qc.aa")
    public final int field4649;

    public class436(int arg0, class434 arg1) {
        this(-1L, arg0, arg1);
    }

    public class436(long arg0, int arg1, class434 arg2) {
        this.field4655 = new class435(this);
        this.field4650 = arg0;
        this.field4649 = arg1;
        this.field4654 = arg2;
        if (this.field4649 == -1) {
            this.field4653 = new HashMap(64);
            this.field4651 = new class405(64, this.field4655);
            this.field4652 = null;
        } else if (this.field4654 == null) {
            throw new IllegalArgumentException("");
        } else {
            this.field4653 = new HashMap(this.field4649);
            this.field4651 = new class405(this.field4649, this.field4655);
            this.field4652 = new class405(this.field4649);
        }
    }

    @ObfuscatedName("qc.at(B)Z")
    public boolean method7304() {
        return this.field4649 != -1;
    }

    @ObfuscatedName("qc.ah(Ljava/lang/Object;B)Ljava/lang/Object;")
    public Object method7307(Object arg0) {
        synchronized (this) {
            if (this.field4650 != -1L) {
                this.method7308();
            }
            class437 var3 = (class437) this.field4653.get(arg0);
            if (var3 == null) {
                return null;
            } else {
                this.method7316(var3, false);
                return var3.field4656;
            }
        }
    }

    @ObfuscatedName("qc.ar(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
    public Object method7322(Object arg0, Object arg1) {
        synchronized (this) {
            if (this.field4650 != -1L) {
                this.method7308();
            }
            class437 var4 = (class437) this.field4653.get(arg0);
            if (var4 != null) {
                Object var5 = var4.field4656;
                var4.field4656 = arg1;
                this.method7316(var4, false);
                return var5;
            }
            if (this.method7304() && this.field4653.size() == this.field4649) {
                class437 var6 = (class437) this.field4652.remove();
                this.field4653.remove(var6.field4659);
                this.field4651.remove(var6);
            }
            class437 var7 = new class437(arg1, arg0);
            this.field4653.put(arg0, var7);
            this.method7316(var7, true);
            return null;
        }
    }

    @ObfuscatedName("qc.ao(Lqe;ZB)V")
    public void method7316(class437 arg0, boolean arg1) {
        if (!arg1) {
            this.field4651.remove(arg0);
            if (this.method7304() && !this.field4652.remove(arg0)) {
                throw new IllegalStateException("");
            }
        }
        arg0.field4658 = System.currentTimeMillis();
        if (this.method7304()) {
            switch(this.field4654.field4644) {
                case 0:
                    arg0.field4657++;
                    break;
                case 1:
                    arg0.field4657 = arg0.field4658;
            }
            this.field4652.add(arg0);
        }
        this.field4651.add(arg0);
    }

    @ObfuscatedName("qc.ab(I)V")
    public void method7308() {
        if (this.field4650 == -1L) {
            throw new IllegalStateException("");
        }
        long var1 = System.currentTimeMillis() - this.field4650;
        while (!this.field4651.isEmpty()) {
            class437 var3 = (class437) this.field4651.peek();
            if (var3.field4658 >= var1) {
                return;
            }
            this.field4653.remove(var3.field4659);
            this.field4651.remove(var3);
            if (this.method7304()) {
                this.field4652.remove(var3);
            }
        }
    }

    @ObfuscatedName("qc.au(I)V")
    public void method7309() {
        synchronized (this) {
            this.field4653.clear();
            this.field4651.clear();
            if (this.method7304()) {
                this.field4652.clear();
            }
        }
    }
}
