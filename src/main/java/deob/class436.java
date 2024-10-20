package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("qs")
public abstract class class436 {

    @ObfuscatedName("qs.av")
    public final int field4662;

    @ObfuscatedName("qs.ap")
    public int field4660 = 0;

    @ObfuscatedName("qs.aq")
    public class434[] field4661;

    @ObfuscatedName("qs.at")
    public HashMap field4666;

    @ObfuscatedName("qs.ah")
    public HashMap field4665;

    @ObfuscatedName("qs.ax")
    public Comparator field4664 = null;

    public class436(int arg0) {
        this.field4662 = arg0;
        this.field4661 = this.method7163(arg0);
        this.field4666 = new HashMap(arg0 / 8);
        this.field4665 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("qs.bb(B)V")
    public void method7322() {
        this.field4660 = 0;
        Arrays.fill(this.field4661, (Object) null);
        this.field4666.clear();
        this.field4665.clear();
    }

    @ObfuscatedName("qs.bn(I)I")
    public int method7308() {
        return this.field4660;
    }

    @ObfuscatedName("qs.ba(I)Z")
    public boolean method7261() {
        return this.field4662 == this.field4660;
    }

    @ObfuscatedName("qs.bf(Lui;I)Z")
    public boolean method7262(class538 arg0) {
        if (arg0.method8883()) {
            return this.field4666.containsKey(arg0) ? true : this.field4665.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("qs.bs(Lui;I)Lqe;")
    public class434 method7263(class538 arg0) {
        class434 var2 = this.method7264(arg0);
        return var2 == null ? this.method7265(arg0) : var2;
    }

    @ObfuscatedName("qs.bp(Lui;I)Lqe;")
    public class434 method7264(class538 arg0) {
        return arg0.method8883() ? (class434) this.field4666.get(arg0) : null;
    }

    @ObfuscatedName("qs.bv(Lui;I)Lqe;")
    public class434 method7265(class538 arg0) {
        return arg0.method8883() ? (class434) this.field4665.get(arg0) : null;
    }

    @ObfuscatedName("qs.bq(Lui;I)Z")
    public final boolean method7266(class538 arg0) {
        class434 var2 = this.method7264(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7267(var2);
            return true;
        }
    }

    @ObfuscatedName("qs.bo(Lqe;I)V")
    public final void method7267(class434 arg0) {
        int var2 = this.method7273(arg0);
        if (var2 != -1) {
            this.method7277(var2);
            this.method7274(arg0);
        }
    }

    @ObfuscatedName("qs.br(Lui;I)Lqe;")
    public class434 method7268(class538 arg0) {
        return this.method7269(arg0, (class538) null);
    }

    @ObfuscatedName("qs.bw(Lui;Lui;I)Lqe;")
    public class434 method7269(class538 arg0, class538 arg1) {
        if (this.method7264(arg0) != null) {
            throw new IllegalStateException();
        }
        class434 var3 = this.method7164();
        var3.method7235(arg0, arg1);
        this.method7275(var3);
        this.method7276(var3);
        return var3;
    }

    @ObfuscatedName("qs.be(II)Lqe;")
    public final class434 method7270(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4660) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4661[arg0];
    }

    @ObfuscatedName("qs.bc(I)V")
    public final void method7271() {
        if (this.field4664 == null) {
            Arrays.sort(this.field4661, 0, this.field4660);
        } else {
            Arrays.sort(this.field4661, 0, this.field4660, this.field4664);
        }
    }

    @ObfuscatedName("qs.bi(Lqe;Lui;Lui;B)V")
    public final void method7272(class434 arg0, class538 arg1, class538 arg2) {
        this.method7274(arg0);
        arg0.method7235(arg1, arg2);
        this.method7276(arg0);
    }

    @ObfuscatedName("qs.bu(Lqe;I)I")
    public final int method7273(class434 arg0) {
        for (int var2 = 0; var2 < this.field4660; var2++) {
            if (this.field4661[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("qs.bk(Lqe;I)V")
    public final void method7274(class434 arg0) {
        if (this.field4666.remove(arg0.field4655) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4656 != null) {
            this.field4665.remove(arg0.field4656);
        }
    }

    @ObfuscatedName("qs.bz(Lqe;I)V")
    public final void method7275(class434 arg0) {
        this.field4661[++this.field4660 - 1] = arg0;
    }

    @ObfuscatedName("qs.bx(Lqe;I)V")
    public final void method7276(class434 arg0) {
        this.field4666.put(arg0.field4655, arg0);
        if (arg0.field4656 != null) {
            class434 var2 = (class434) this.field4665.put(arg0.field4656, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4656 = null;
            }
        }
    }

    @ObfuscatedName("qs.bh(II)V")
    public final void method7277(int arg0) {
        this.field4660--;
        if (arg0 < this.field4660) {
            System.arraycopy(this.field4661, arg0 + 1, this.field4661, arg0, this.field4660 - arg0);
        }
    }

    @ObfuscatedName("qs.bm(I)V")
    public final void method7323() {
        this.field4664 = null;
    }

    @ObfuscatedName("qs.bl(Ljava/util/Comparator;I)V")
    public final void method7280(Comparator arg0) {
        if (this.field4664 == null) {
            this.field4664 = arg0;
        } else if (this.field4664 instanceof class435) {
            ((class435) this.field4664).method7249(arg0);
        }
    }

    @ObfuscatedName("qs.aw(S)Lqe;")
    public abstract class434 method7164();

    @ObfuscatedName("qs.ay(IB)[Lqe;")
    public abstract class434[] method7163(int arg0);
}
