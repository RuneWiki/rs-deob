package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("mj")
public abstract class class340 {

    @ObfuscatedName("mj.e")
    public final int field3969;

    @ObfuscatedName("mj.i")
    public int field3964 = 0;

    @ObfuscatedName("mj.y")
    public class338[] field3965;

    @ObfuscatedName("mj.w")
    public HashMap field3966;

    @ObfuscatedName("mj.g")
    public HashMap field3967;

    @ObfuscatedName("mj.v")
    public Comparator field3968 = null;

    public class340(int arg0) {
        this.field3969 = arg0;
        this.field3965 = this.method5439(arg0);
        this.field3966 = new HashMap(arg0 / 8);
        this.field3967 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("mj.ad(I)V")
    public void method5583() {
        this.field3964 = 0;
        Arrays.fill(this.field3965, (Object) null);
        this.field3966.clear();
        this.field3967.clear();
    }

    @ObfuscatedName("mj.as(I)I")
    public int method5564() {
        return this.field3964;
    }

    @ObfuscatedName("mj.ak(I)Z")
    public boolean method5582() {
        return this.field3969 == this.field3964;
    }

    @ObfuscatedName("mj.ah(Lpm;I)Z")
    public boolean method5539(class422 arg0) {
        if (arg0.method6817()) {
            return this.field3966.containsKey(arg0) ? true : this.field3967.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("mj.ay(Lpm;I)Llu;")
    public class338 method5540(class422 arg0) {
        class338 var2 = this.method5541(arg0);
        return var2 == null ? this.method5542(arg0) : var2;
    }

    @ObfuscatedName("mj.al(Lpm;I)Llu;")
    public class338 method5541(class422 arg0) {
        return arg0.method6817() ? (class338) this.field3966.get(arg0) : null;
    }

    @ObfuscatedName("mj.ao(Lpm;B)Llu;")
    public class338 method5542(class422 arg0) {
        return arg0.method6817() ? (class338) this.field3967.get(arg0) : null;
    }

    @ObfuscatedName("mj.au(Lpm;I)Z")
    public final boolean method5543(class422 arg0) {
        class338 var2 = this.method5541(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method5544(var2);
            return true;
        }
    }

    @ObfuscatedName("mj.aa(Llu;B)V")
    public final void method5544(class338 arg0) {
        int var2 = this.method5550(arg0);
        if (var2 != -1) {
            this.method5554(var2);
            this.method5551(arg0);
        }
    }

    @ObfuscatedName("mj.ag(Lpm;I)Llu;")
    public class338 method5545(class422 arg0) {
        return this.method5599(arg0, (class422) null);
    }

    @ObfuscatedName("mj.aq(Lpm;Lpm;I)Llu;")
    public class338 method5599(class422 arg0, class422 arg1) {
        if (this.method5541(arg0) != null) {
            throw new IllegalStateException();
        }
        class338 var3 = this.method5438();
        var3.method5511(arg0, arg1);
        this.method5600(var3);
        this.method5553(var3);
        return var3;
    }

    @ObfuscatedName("mj.ar(II)Llu;")
    public final class338 method5547(int arg0) {
        if (arg0 < 0 || arg0 >= this.field3964) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field3965[arg0];
    }

    @ObfuscatedName("mj.ac(I)V")
    public final void method5552() {
        if (this.field3968 == null) {
            Arrays.sort(this.field3965, 0, this.field3964);
        } else {
            Arrays.sort(this.field3965, 0, this.field3964, this.field3968);
        }
    }

    @ObfuscatedName("mj.at(Llu;Lpm;Lpm;B)V")
    public final void method5549(class338 arg0, class422 arg1, class422 arg2) {
        this.method5551(arg0);
        arg0.method5511(arg1, arg2);
        this.method5553(arg0);
    }

    @ObfuscatedName("mj.ax(Llu;I)I")
    public final int method5550(class338 arg0) {
        for (int var2 = 0; var2 < this.field3964; var2++) {
            if (this.field3965[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("mj.an(Llu;I)V")
    public final void method5551(class338 arg0) {
        if (this.field3966.remove(arg0.field3960) == null) {
            throw new IllegalStateException();
        } else if (arg0.field3959 != null) {
            this.field3967.remove(arg0.field3959);
        }
    }

    @ObfuscatedName("mj.av(Llu;B)V")
    public final void method5600(class338 arg0) {
        this.field3965[++this.field3964 - 1] = arg0;
    }

    @ObfuscatedName("mj.ap(Llu;I)V")
    public final void method5553(class338 arg0) {
        this.field3966.put(arg0.field3960, arg0);
        if (arg0.field3959 != null) {
            class338 var2 = (class338) this.field3967.put(arg0.field3959, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field3959 = null;
            }
        }
    }

    @ObfuscatedName("mj.aj(IB)V")
    public final void method5554(int arg0) {
        this.field3964--;
        if (arg0 < this.field3964) {
            System.arraycopy(this.field3965, arg0 + 1, this.field3965, arg0, this.field3964 - arg0);
        }
    }

    @ObfuscatedName("mj.am(B)V")
    public final void method5556() {
        this.field3968 = null;
    }

    @ObfuscatedName("mj.aw(Ljava/util/Comparator;I)V")
    public final void method5557(Comparator arg0) {
        if (this.field3968 == null) {
            this.field3968 = arg0;
        } else if (this.field3968 instanceof class339) {
            ((class339) this.field3968).method5524(arg0);
        }
    }

    @ObfuscatedName("mj.l(I)Llu;")
    public abstract class338 method5438();

    @ObfuscatedName("mj.q(II)[Llu;")
    public abstract class338[] method5439(int arg0);
}
