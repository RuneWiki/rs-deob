package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("ei")
public class class147 extends class387 {

    @ObfuscatedName("ei.c")
    public boolean field1638;

    @ObfuscatedName("ei.b")
    public boolean field1643 = true;

    @ObfuscatedName("ei.p")
    public List field1639;

    @ObfuscatedName("ei.m")
    public int[] field1640;

    @ObfuscatedName("ei.t")
    public long field1641;

    @ObfuscatedName("ei.s")
    public String field1642 = null;

    @ObfuscatedName("ei.j")
    public byte field1637;

    @ObfuscatedName("ei.w")
    public byte field1644;

    static {
        new BitSet(65536);
    }

    public class147(class419 arg0) {
        this.method2738(arg0);
    }

    @ObfuscatedName("ei.c(I)[I")
    public int[] method2751() {
        if (this.field1640 == null) {
            String[] var1 = new String[this.field1639.size()];
            this.field1640 = new int[this.field1639.size()];
            int var2 = 0;
            while (var2 < this.field1639.size()) {
                var1[var2] = ((class129) this.field1639.get(var2)).field1506.method7202();
                this.field1640[var2] = var2++;
            }
            int[] var3 = this.field1640;
            class414.method4975(var1, var3, 0, var1.length - 1);
        }
        return this.field1640;
    }

    @ObfuscatedName("ei.b(Ldz;B)V")
    public void method2735(class129 arg0) {
        this.field1639.add(arg0);
        this.field1640 = null;
    }

    @ObfuscatedName("ei.p(II)V")
    public void method2746(int arg0) {
        this.field1639.remove(arg0);
        this.field1640 = null;
    }

    @ObfuscatedName("ei.m(B)I")
    public int method2736() {
        return this.field1639.size();
    }

    @ObfuscatedName("ei.t(Ljava/lang/String;I)I")
    public int method2737(String arg0) {
        if (!this.field1643) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1639.size(); var2++) {
            if (((class129) this.field1639.get(var2)).field1506.method7187().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("ei.s(Lpi;I)V")
    public void method2738(class419 arg0) {
        int var2 = arg0.method6781();
        if ((var2 & 0x1) != 0) {
            this.field1638 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1643 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method6781();
        }
        this.field4257 = arg0.method6676();
        this.field1641 = arg0.method6676();
        this.field1642 = arg0.method6707();
        arg0.method6733();
        this.field1644 = arg0.method6846();
        this.field1637 = arg0.method6846();
        int var4 = arg0.method6672();
        if (var4 <= 0) {
            return;
        }
        this.field1639 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class129 var6 = new class129();
            if (this.field1638) {
                arg0.method6676();
            }
            if (this.field1643) {
                var6.field1506 = new class440(arg0.method6707());
            }
            var6.field1507 = arg0.method6846();
            var6.field1510 = arg0.method6672();
            if (var3 >= 3) {
                arg0.method6733();
            }
            this.field1639.add(var5, var6);
        }
    }
}
