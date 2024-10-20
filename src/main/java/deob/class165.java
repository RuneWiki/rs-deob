package deob;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfuscatedName("gi")
public class class165 extends class493 {

    @ObfuscatedName("gi.az")
    public boolean field1804;

    @ObfuscatedName("gi.ah")
    public boolean field1797 = true;

    @ObfuscatedName("gi.af")
    public List field1798;

    @ObfuscatedName("gi.at")
    public int[] field1799;

    @ObfuscatedName("gi.an")
    public long field1796;

    @ObfuscatedName("gi.ao")
    public String field1803 = null;

    @ObfuscatedName("gi.ab")
    public byte field1802;

    @ObfuscatedName("gi.aw")
    public byte field1800;

    static {
        new BitSet(65536);
    }

    public class165(class535 arg0) {
        this.method3124(arg0);
    }

    @ObfuscatedName("gi.az(I)[I")
    public int[] method3107() {
        if (this.field1799 == null) {
            String[] var1 = new String[this.field1798.size()];
            this.field1799 = new int[this.field1798.size()];
            int var2 = 0;
            while (var2 < this.field1798.size()) {
                var1[var2] = ((class147) this.field1798.get(var2)).field1685.method9078();
                this.field1799[var2] = var2++;
            }
            class530.method8339(var1, this.field1799);
        }
        return this.field1799;
    }

    @ObfuscatedName("gi.ah(Lfr;B)V")
    public void method3108(class147 arg0) {
        this.field1798.add(arg0);
        this.field1799 = null;
    }

    @ObfuscatedName("gi.af(IB)V")
    public void method3109(int arg0) {
        this.field1798.remove(arg0);
        this.field1799 = null;
    }

    @ObfuscatedName("gi.at(B)I")
    public int method3122() {
        return this.field1798.size();
    }

    @ObfuscatedName("gi.an(Ljava/lang/String;I)I")
    public int method3111(String arg0) {
        if (!this.field1797) {
            throw new RuntimeException("Displaynames not available");
        }
        for (int var2 = 0; var2 < this.field1798.size(); var2++) {
            if (((class147) this.field1798.get(var2)).field1685.method9077().equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("gi.ao(Lur;B)V")
    public void method3124(class535 arg0) {
        int var2 = arg0.method8462();
        if ((var2 & 0x1) != 0) {
            this.field1804 = true;
        }
        if ((var2 & 0x2) != 0) {
            this.field1797 = true;
        }
        int var3 = 2;
        if ((var2 & 0x4) != 0) {
            var3 = arg0.method8462();
        }
        this.field4951 = arg0.method8469();
        this.field1796 = arg0.method8469();
        this.field1803 = arg0.method8473();
        arg0.method8640();
        this.field1800 = arg0.method8463();
        this.field1802 = arg0.method8463();
        int var4 = arg0.method8670();
        if (var4 <= 0) {
            return;
        }
        this.field1798 = new ArrayList(var4);
        for (int var5 = 0; var5 < var4; var5++) {
            class147 var6 = new class147();
            if (this.field1804) {
                arg0.method8469();
            }
            if (this.field1797) {
                var6.field1685 = new class558(arg0.method8473());
            }
            var6.field1683 = arg0.method8463();
            var6.field1684 = arg0.method8670();
            if (var3 >= 3) {
                arg0.method8640();
            }
            this.field1798.add(var5, var6);
        }
    }
}
