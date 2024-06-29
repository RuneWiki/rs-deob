import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class305 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4309;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Ltb;[Laf;)V", line = 3)
    public dxVertexLayout(class364 arg0, class399[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field5197);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class399 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2449(0); var8++) {
                class342 var9 = var7.method2446(var8, 115);
                int var10;
                byte var11;
                byte var12;
                if (class342.field5015 == var9) {
                    var10 = 0;
                    var11 = 0;
                    var12 = 2;
                } else if (class342.field5016 == var9) {
                    var10 = 0;
                    var12 = 2;
                    var11 = 3;
                } else if (class342.field5017 == var9) {
                    var11 = 10;
                    var10 = 0;
                    var12 = 4;
                } else if (class342.field5018 == var9) {
                    var10 = var4++;
                    var12 = 0;
                    var11 = 5;
                } else if (class342.field5019 == var9) {
                    var10 = var4++;
                    var11 = 5;
                    var12 = 1;
                } else if (class342.field5020 == var9) {
                    var10 = var4++;
                    var11 = 5;
                    var12 = 2;
                } else {
                    var10 = var4++;
                    var11 = 5;
                    var12 = 3;
                }
                var3.addElement(var5, var12, 0, var11, var10, var6);
                var6 += var9.field5014;
            }
        }
        var3.finish();
        this.field4309 = arg0.field5204.method2650(var3, null);
    }
}
