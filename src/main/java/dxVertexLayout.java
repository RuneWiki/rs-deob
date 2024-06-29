import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class114 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4183;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lul;[Lfk;)V", line = 3)
    public dxVertexLayout(class574 arg0, class655[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8058);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class655 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method3679((byte) -125); var8++) {
                class307 var9 = var7.method3680(81, var8);
                if (class307.field4043 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class307.field4048 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class307.field4049 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class307.field4050 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class307.field4051 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class307.field4052 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class307.field4053 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field4046;
            }
        }
        var3.finish();
        this.field4183 = arg0.field8080.method2883(var3, null);
    }
}
