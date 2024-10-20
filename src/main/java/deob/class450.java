package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("rn")
public abstract class class450 {

    @ObfuscatedName("rn.am")
    public final int field4707;

    @ObfuscatedName("rn.av")
    public int field4705 = 0;

    @ObfuscatedName("rn.ag")
    public class448[] field4706;

    @ObfuscatedName("rn.aa")
    public HashMap field4708;

    @ObfuscatedName("rn.ap")
    public HashMap field4704;

    @ObfuscatedName("rn.ay")
    public Comparator field4709 = null;

    public class450(int arg0) {
        this.field4707 = arg0;
        this.field4706 = this.method7263(arg0);
        this.field4708 = new HashMap(arg0 / 8);
        this.field4704 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("rn.bb(B)V")
    public void method7408() {
        this.field4705 = 0;
        Arrays.fill(this.field4706, (Object) null);
        this.field4708.clear();
        this.field4704.clear();
    }

    @ObfuscatedName("rn.bo(I)I")
    public int method7406() {
        return this.field4705;
    }

    @ObfuscatedName("rn.bp(I)Z")
    public boolean method7422() {
        return this.field4707 == this.field4705;
    }

    @ObfuscatedName("rn.bt(Lvf;I)Z")
    public boolean method7359(class553 arg0) {
        if (arg0.method8994()) {
            return this.field4708.containsKey(arg0) ? true : this.field4704.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("rn.bm(Lvf;I)Lrp;")
    public class448 method7360(class553 arg0) {
        class448 var2 = this.method7371(arg0);
        return var2 == null ? this.method7385(arg0) : var2;
    }

    @ObfuscatedName("rn.br(Lvf;I)Lrp;")
    public class448 method7371(class553 arg0) {
        return arg0.method8994() ? (class448) this.field4708.get(arg0) : null;
    }

    @ObfuscatedName("rn.bs(Lvf;B)Lrp;")
    public class448 method7385(class553 arg0) {
        return arg0.method8994() ? (class448) this.field4704.get(arg0) : null;
    }

    @ObfuscatedName("rn.bc(Lvf;I)Z")
    public final boolean method7363(class553 arg0) {
        class448 var2 = this.method7371(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7356(var2);
            return true;
        }
    }

    @ObfuscatedName("rn.bu(Lrp;B)V")
    public final void method7356(class448 arg0) {
        int var2 = this.method7370(arg0);
        if (var2 != -1) {
            this.method7361(var2);
            this.method7395(arg0);
        }
    }

    @ObfuscatedName("rn.bf(Lvf;B)Lrp;")
    public class448 method7365(class553 arg0) {
        return this.method7355(arg0, (class553) null);
    }

    @ObfuscatedName("rn.bh(Lvf;Lvf;I)Lrp;")
    public class448 method7355(class553 arg0, class553 arg1) {
        if (this.method7371(arg0) != null) {
            throw new IllegalStateException();
        }
        class448 var3 = this.method7257();
        var3.method7333(arg0, arg1);
        this.method7372(var3);
        this.method7398(var3);
        return var3;
    }

    @ObfuscatedName("rn.bl(IB)Lrp;")
    public final class448 method7367(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4705) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4706[arg0];
    }

    @ObfuscatedName("rn.bg(I)V")
    public final void method7368() {
        if (this.field4709 == null) {
            Arrays.sort(this.field4706, 0, this.field4705);
        } else {
            Arrays.sort(this.field4706, 0, this.field4705, this.field4709);
        }
    }

    @ObfuscatedName("rn.bj(Lrp;Lvf;Lvf;B)V")
    public final void method7369(class448 arg0, class553 arg1, class553 arg2) {
        this.method7395(arg0);
        arg0.method7333(arg1, arg2);
        this.method7398(arg0);
    }

    @ObfuscatedName("rn.bx(Lrp;I)I")
    public final int method7370(class448 arg0) {
        for (int var2 = 0; var2 < this.field4705; var2++) {
            if (this.field4706[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("rn.bi(Lrp;B)V")
    public final void method7395(class448 arg0) {
        if (this.field4708.remove(arg0.field4696) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4697 != null) {
            this.field4704.remove(arg0.field4697);
        }
    }

    @ObfuscatedName("rn.bq(Lrp;I)V")
    public final void method7372(class448 arg0) {
        this.field4706[++this.field4705 - 1] = arg0;
    }

    @ObfuscatedName("rn.bw(Lrp;S)V")
    public final void method7398(class448 arg0) {
        this.field4708.put(arg0.field4696, arg0);
        if (arg0.field4697 != null) {
            class448 var2 = (class448) this.field4704.put(arg0.field4697, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4697 = null;
            }
        }
    }

    @ObfuscatedName("rn.ce(II)V")
    public final void method7361(int arg0) {
        this.field4705--;
        if (arg0 < this.field4705) {
            System.arraycopy(this.field4706, arg0 + 1, this.field4706, arg0, this.field4705 - arg0);
        }
    }

    @ObfuscatedName("rn.cu(I)V")
    public final void method7375() {
        this.field4709 = null;
    }

    @ObfuscatedName("rn.cw(Ljava/util/Comparator;I)V")
    public final void method7403(Comparator arg0) {
        if (this.field4709 == null) {
            this.field4709 = arg0;
        } else if (this.field4709 instanceof class449) {
            ((class449) this.field4709).method7349(arg0);
        }
    }

    @ObfuscatedName("rn.ac(I)Lrp;")
    public abstract class448 method7257();

    @ObfuscatedName("rn.al(II)[Lrp;")
    public abstract class448[] method7263(int arg0);
}
