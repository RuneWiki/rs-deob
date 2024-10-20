package deob;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfuscatedName("pq")
public abstract class class410 {

    @ObfuscatedName("pq.at")
    public final int field4589;

    @ObfuscatedName("pq.aa")
    public int field4588 = 0;

    @ObfuscatedName("pq.ay")
    public class408[] field4590;

    @ObfuscatedName("pq.ao")
    public HashMap field4593;

    @ObfuscatedName("pq.ax")
    public HashMap field4592;

    @ObfuscatedName("pq.ai")
    public Comparator field4591 = null;

    public class410(int arg0) {
        this.field4589 = arg0;
        this.field4590 = this.method7088(arg0);
        this.field4593 = new HashMap(arg0 / 8);
        this.field4592 = new HashMap(arg0 / 8);
    }

    @ObfuscatedName("pq.bz(I)V")
    public void method7231() {
        this.field4588 = 0;
        Arrays.fill(this.field4590, (Object) null);
        this.field4593.clear();
        this.field4592.clear();
    }

    @ObfuscatedName("pq.bm(I)I")
    public int method7195() {
        return this.field4588;
    }

    @ObfuscatedName("pq.bd(I)Z")
    public boolean method7196() {
        return this.field4589 == this.field4588;
    }

    @ObfuscatedName("pq.bt(Ltm;I)Z")
    public boolean method7218(class513 arg0) {
        if (arg0.method8843()) {
            return this.field4593.containsKey(arg0) ? true : this.field4592.containsKey(arg0);
        } else {
            return false;
        }
    }

    @ObfuscatedName("pq.bj(Ltm;I)Lpw;")
    public class408 method7224(class513 arg0) {
        class408 var2 = this.method7198(arg0);
        return var2 == null ? this.method7204(arg0) : var2;
    }

    @ObfuscatedName("pq.bn(Ltm;S)Lpw;")
    public class408 method7198(class513 arg0) {
        return arg0.method8843() ? (class408) this.field4593.get(arg0) : null;
    }

    @ObfuscatedName("pq.bs(Ltm;I)Lpw;")
    public class408 method7204(class513 arg0) {
        return arg0.method8843() ? (class408) this.field4592.get(arg0) : null;
    }

    @ObfuscatedName("pq.br(Ltm;S)Z")
    public final boolean method7206(class513 arg0) {
        class408 var2 = this.method7198(arg0);
        if (var2 == null) {
            return false;
        } else {
            this.method7208(var2);
            return true;
        }
    }

    @ObfuscatedName("pq.bg(Lpw;I)V")
    public final void method7208(class408 arg0) {
        int var2 = this.method7207(arg0);
        if (var2 != -1) {
            this.method7211(var2);
            this.method7203(arg0);
        }
    }

    @ObfuscatedName("pq.bu(Ltm;B)Lpw;")
    public class408 method7202(class513 arg0) {
        return this.method7221(arg0, (class513) null);
    }

    @ObfuscatedName("pq.bf(Ltm;Ltm;B)Lpw;")
    public class408 method7221(class513 arg0, class513 arg1) {
        if (this.method7198(arg0) != null) {
            throw new IllegalStateException();
        }
        class408 var3 = this.method7085();
        var3.method7170(arg0, arg1);
        this.method7209(var3);
        this.method7259(var3);
        return var3;
    }

    @ObfuscatedName("pq.bq(II)Lpw;")
    public final class408 method7220(int arg0) {
        if (arg0 < 0 || arg0 >= this.field4588) {
            throw new ArrayIndexOutOfBoundsException(arg0);
        }
        return this.field4590[arg0];
    }

    @ObfuscatedName("pq.ba(B)V")
    public final void method7205() {
        if (this.field4591 == null) {
            Arrays.sort(this.field4590, 0, this.field4588);
        } else {
            Arrays.sort(this.field4590, 0, this.field4588, this.field4591);
        }
    }

    @ObfuscatedName("pq.bv(Lpw;Ltm;Ltm;I)V")
    public final void method7210(class408 arg0, class513 arg1, class513 arg2) {
        this.method7203(arg0);
        arg0.method7170(arg1, arg2);
        this.method7259(arg0);
    }

    @ObfuscatedName("pq.bl(Lpw;I)I")
    public final int method7207(class408 arg0) {
        for (int var2 = 0; var2 < this.field4588; var2++) {
            if (this.field4590[var2] == arg0) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("pq.bp(Lpw;B)V")
    public final void method7203(class408 arg0) {
        if (this.field4593.remove(arg0.field4581) == null) {
            throw new IllegalStateException();
        } else if (arg0.field4579 != null) {
            this.field4592.remove(arg0.field4579);
        }
    }

    @ObfuscatedName("pq.bc(Lpw;B)V")
    public final void method7209(class408 arg0) {
        this.field4590[++this.field4588 - 1] = arg0;
    }

    @ObfuscatedName("pq.bh(Lpw;I)V")
    public final void method7259(class408 arg0) {
        this.field4593.put(arg0.field4581, arg0);
        if (arg0.field4579 != null) {
            class408 var2 = (class408) this.field4592.put(arg0.field4579, arg0);
            if (var2 != null && arg0 != var2) {
                var2.field4579 = null;
            }
        }
    }

    @ObfuscatedName("pq.bw(IB)V")
    public final void method7211(int arg0) {
        this.field4588--;
        if (arg0 < this.field4588) {
            System.arraycopy(this.field4590, arg0 + 1, this.field4590, arg0, this.field4588 - arg0);
        }
    }

    @ObfuscatedName("pq.ce(I)V")
    public final void method7212() {
        this.field4591 = null;
    }

    @ObfuscatedName("pq.ci(Ljava/util/Comparator;B)V")
    public final void method7213(Comparator arg0) {
        if (this.field4591 == null) {
            this.field4591 = arg0;
        } else if (this.field4591 instanceof class409) {
            ((class409) this.field4591).method7182(arg0);
        }
    }

    @ObfuscatedName("pq.an(II)[Lpw;")
    public abstract class408[] method7088(int arg0);

    @ObfuscatedName("pq.af(I)Lpw;")
    public abstract class408 method7085();
}
