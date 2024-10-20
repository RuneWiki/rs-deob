package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ki")
public class class263 extends class242 {

    @ObfuscatedName("ki.af")
    public HashSet field2692;

    @ObfuscatedName("ki.ax")
    public HashSet field2690;

    @ObfuscatedName("ki.an")
    public List field2691;

    @ObfuscatedName("ki.cp(Luq;Luq;IZB)V")
    public void method4603(class534 arg0, class534 arg1, int arg2, boolean arg3) {
        this.method4257(arg0, arg2);
        int var5 = arg1.method8593();
        this.field2692 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class237 var7 = new class237();
            try {
                var7.method4201(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2692.add(var7);
        }
        int var9 = arg1.method8593();
        this.field2690 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class245 var11 = new class245();
            try {
                var11.method4489(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2690.add(var11);
        }
        this.method4607(arg1, arg3);
    }

    @ObfuscatedName("ki.cc(Luq;ZI)V")
    public void method4607(class534 arg0, boolean arg1) {
        this.field2691 = new LinkedList();
        int var3 = arg0.method8593();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8811();
            class339 var6 = new class339(arg0.method8597());
            boolean var7 = arg0.method8591() == 1;
            if (arg1 || !var7) {
                this.field2691.add(new class248((class339) null, var6, var5, (class255) null));
            }
        }
    }
}
