package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("sc")
public abstract class class473 {

    @ObfuscatedName("sc.ab")
    public final int field4953;

    @ObfuscatedName("sc.ai")
    public int field4948 = 0;

    @ObfuscatedName("sc.ae")
    public class471[] field4951;

    @ObfuscatedName("sc.au")
    public HashMap field4949;

    @ObfuscatedName("sc.ah")
    public HashMap field4952;

    @ObfuscatedName("sc.az")
    public Comparator field4950 = null;

    public class473(int arg0) {
        this.field4953 = arg0;
        this.field4951 = this.method7760(arg0);
        this.field4949 = new HashMap(arg0 / 8);
        this.field4952 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("sc.bu(I)V")
    public void method7866() {
        this.field4948 = 0;
        Arrays.fill(this.field4951, (Object) null);
        this.field4949.clear();
        this.field4952.clear();
    }

    @ObfuscatedName("sc.by(S)I")
    public int method7889() {
        return this.field4948;
    }

    @ObfuscatedName("sc.bw(I)Z")
    public boolean method7868() {
        return this.field4953 == this.field4948;
    }

    @ObfuscatedName("sc.bl(Lvo;B)Z")
    public boolean method7869(class569 arg0) {
        if (arg0.method9359()) {
            return this.field4949.containsKey(arg0) ? true : this.field4952.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("sc.bc(Lvo;B)Lsk;")
    public class471 method7870(class569 arg0) {
        class471 var2 = this.method7886(arg0);
        return var2 == null ? this.method7901(arg0) : var2;
    }

    @ObfuscatedName("sc.bv(Lvo;B)Lsk;")
    public class471 method7886(class569 arg0) {
        return arg0.method9359() ? (class471) this.field4949.get(arg0) : null;
    }

    @ObfuscatedName("sc.bb(Lvo;I)Lsk;")
    public class471 method7901(class569 arg0) {
        return arg0.method9359() ? (class471) this.field4952.get(arg0) : null;
    }

    @ObfuscatedName("sc.bn(Lvo;I)Z")
    public final boolean method7921(class569 arg0) {
        class471 var2 = this.method7886(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7874(var2);
            return true;
        }
    }

    @ObfuscatedName("sc.bh(Lsk;S)V")
    public final void method7874(class471 arg0) {
        int var2 = this.method7879(arg0);
        if (var2 != -1) {
            this.method7885(var2);
            this.method7880(arg0);
        }
    }

    @ObfuscatedName("sc.bq(Lvo;I)Lsk;")
    public class471 method7900(class569 arg0) {
        return this.method7875(arg0, (class569) null);
    }

    @ObfuscatedName("sc.bd(Lvo;Lvo;I)Lsk;")
    public class471 method7875(class569 arg0, class569 arg1) {
        if (this.method7886(arg0) != null) {
            throw new IllegalStateException();
        }
        class471 var3 = this.method7759();
        var3.method7845(arg0, arg1);
        this.method7922(var3);
        this.method7882(var3);
        return var3;
    }

    @ObfuscatedName("sc.bz(II)Lsk;")
    public final class471 method7876(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4948) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4951[arg0];
    }

    @ObfuscatedName("sc.bk(B)V")
    public final void method7877() {
        if (this.field4950 == null) {
            Arrays.sort(this.field4951, 0, this.field4948);
        } else {
            Arrays.sort(this.field4951, 0, this.field4948, this.field4950);
        }
    }

    @ObfuscatedName("sc.br(Lsk;Lvo;Lvo;I)V")
    public final void method7878(class471 arg0, class569 arg1, class569 arg2) {
        this.method7880(arg0);
        arg0.method7845(arg1, arg2);
        this.method7882(arg0);
    }

    @ObfuscatedName("sc.bf(Lsk;I)I")
    public final int method7879(class471 arg0) {
        for (int var2 = 0; var2 < this.field4948; var2++) {
            if (this.field4951[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("sc.cf(Lsk;I)V")
    public final void method7880(class471 arg0) {
        if (this.field4949.remove(arg0.field4946) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4945 != null) {
            this.field4952.remove(arg0.field4945);
        }
    }

    @ObfuscatedName("sc.cv(Lsk;I)V")
    public final void method7922(class471 arg0) {
        this.field4951[++this.field4948 - 1] = arg0;
    }

    @ObfuscatedName("sc.cl(Lsk;I)V")
    public final void method7882(class471 arg0) {
        this.field4949.put(arg0.field4946, arg0);
        if (arg0.field4945 != null) {
            class471 var2 = (class471) this.field4952.put(arg0.field4945, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4945 = null;
            }
        }
    }

    @ObfuscatedName("sc.cm(II)V")
    public final void method7885(int arg0) {
        this.field4948--;
        if (arg0 < this.field4948) {
            System.arraycopy(this.field4951, arg0 + 1, this.field4951, arg0, this.field4948 - arg0);
        }
    }

    @ObfuscatedName("sc.cg(I)V")
    public final void method7883() {
        this.field4950 = null;
    }

    @ObfuscatedName("sc.cu(Ljava/util/Comparator;B)V")
    public final void method7911(Comparator arg0) {
        if (this.field4950 == null) {
            this.field4950 = arg0;
        } else if (this.field4950 instanceof class472) {
            ((class472) this.field4950).method7856(arg0);
        }
    }

    @ObfuscatedName("sc.aq(B)Lsk;")
    public abstract class471 method7759();

    @ObfuscatedName("sc.ad(II)[Lsk;")
    public abstract class471[] method7760(int arg0);
}
