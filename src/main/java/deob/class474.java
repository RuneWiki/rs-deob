package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("so")
public abstract class class474 {

    @ObfuscatedName("so.ae")
    public final int field4930;

    @ObfuscatedName("so.ad")
    public int field4926 = 0;

    @ObfuscatedName("so.aq")
    public class472[] field4928;

    @ObfuscatedName("so.al")
    public HashMap field4925;

    @ObfuscatedName("so.aj")
    public HashMap field4927;

    @ObfuscatedName("so.as")
    public Comparator field4929 = null;

    public class474(int arg0) {
        this.field4930 = arg0;
        this.field4928 = this.method7862(arg0);
        this.field4925 = new HashMap(arg0 / 8);
        this.field4927 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("so.bh(I)V")
    public void method7980() {
        this.field4926 = 0;
        Arrays.fill(this.field4928, (Object) null);
        this.field4925.clear();
        this.field4927.clear();
    }

    @ObfuscatedName("so.bx(B)I")
    public int method8008() {
        return this.field4926;
    }

    @ObfuscatedName("so.bv(S)Z")
    public boolean method8022() {
        return this.field4930 == this.field4926;
    }

    @ObfuscatedName("so.bu(Lvf;I)Z")
    public boolean method8000(class572 arg0) {
        if (arg0.method9468()) {
            return this.field4925.containsKey(arg0) ? true : this.field4927.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("so.bp(Lvf;B)Lsz;")
    public class472 method7958(class572 arg0) {
        class472 var2 = this.method7959(arg0);
        return var2 == null ? this.method7960(arg0) : var2;
    }

    @ObfuscatedName("so.br(Lvf;I)Lsz;")
    public class472 method7959(class572 arg0) {
        return arg0.method9468() ? (class472) this.field4925.get(arg0) : null;
    }

    @ObfuscatedName("so.bf(Lvf;I)Lsz;")
    public class472 method7960(class572 arg0) {
        return arg0.method9468() ? (class472) this.field4927.get(arg0) : null;
    }

    @ObfuscatedName("so.bq(Lvf;I)Z")
    public final boolean method7961(class572 arg0) {
        class472 var2 = this.method7959(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7955(var2);
            return true;
        }
    }

    @ObfuscatedName("so.bt(Lsz;B)V")
    public final void method7955(class472 arg0) {
        int var2 = this.method7967(arg0);
        if (var2 != -1) {
            this.method7971(var2);
            this.method7975(arg0);
        }
    }

    @ObfuscatedName("so.bi(Lvf;I)Lsz;")
    public class472 method7963(class572 arg0) {
        return this.method7965(arg0, (class572) null);
    }

    @ObfuscatedName("so.be(Lvf;Lvf;I)Lsz;")
    public class472 method7965(class572 arg0, class572 arg1) {
        if (this.method7959(arg0) != null) {
            throw new IllegalStateException();
        }
        class472 var3 = this.method7861();
        var3.method7939(arg0, arg1);
        this.method7990(var3);
        this.method7969(var3);
        return var3;
    }

    @ObfuscatedName("so.ba(II)Lsz;")
    public final class472 method7964(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4926) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4928[arg0];
    }

    @ObfuscatedName("so.bn(B)V")
    public final void method7970() {
        if (this.field4929 == null) {
            Arrays.sort(this.field4928, 0, this.field4926);
        } else {
            Arrays.sort(this.field4928, 0, this.field4926, this.field4929);
        }
    }

    @ObfuscatedName("so.bw(Lsz;Lvf;Lvf;I)V")
    public final void method8010(class472 arg0, class572 arg1, class572 arg2) {
        this.method7975(arg0);
        arg0.method7939(arg1, arg2);
        this.method7969(arg0);
    }

    @ObfuscatedName("so.bk(Lsz;B)I")
    public final int method7967(class472 arg0) {
        for (int var2 = 0; var2 < this.field4926; var2++) {
            if (this.field4928[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("so.bs(Lsz;I)V")
    public final void method7975(class472 arg0) {
        if (this.field4925.remove(arg0.field4919) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4920 != null) {
            this.field4927.remove(arg0.field4920);
        }
    }

    @ObfuscatedName("so.bb(Lsz;I)V")
    public final void method7990(class472 arg0) {
        this.field4928[++this.field4926 - 1] = arg0;
    }

    @ObfuscatedName("so.by(Lsz;I)V")
    public final void method7969(class472 arg0) {
        this.field4925.put(arg0.field4919, arg0);
        if (arg0.field4920 != null) {
            class472 var2 = (class472) this.field4927.put(arg0.field4920, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4920 = null;
            }
        }
    }

    @ObfuscatedName("so.bl(II)V")
    public final void method7971(int arg0) {
        this.field4926--;
        if (arg0 < this.field4926) {
            System.arraycopy(this.field4928, arg0 + 1, this.field4928, arg0, this.field4926 - arg0);
        }
    }

    @ObfuscatedName("so.cx(I)V")
    public final void method7973() {
        this.field4929 = null;
    }

    @ObfuscatedName("so.cu(Ljava/util/Comparator;I)V")
    public final void method7974(Comparator arg0) {
        if (this.field4929 == null) {
            this.field4929 = arg0;
        } else if (this.field4929 instanceof class473) {
            ((class473) this.field4929).method7949(arg0);
        }
    }

    @ObfuscatedName("so.ay(IB)[Lsz;")
    public abstract class472[] method7862(int arg0);

    @ObfuscatedName("so.ab(I)Lsz;")
    public abstract class472 method7861();
}
