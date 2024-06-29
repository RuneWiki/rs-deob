import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class193 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4613;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Laia;[Lug;)V")
    public dxVertexLayout(class242 arg0, class588[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field3447);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class588 var7 = arg1[var5];
            for (int var8 = 0; var7.method3375(1) > var8; var8++) {
                class601 var9 = var7.method3376(0, var8);
                if (class601.field8400 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class601.field8402 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class601.field8403 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class601.field8404 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class601.field8405 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class601.field8406 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class601.field8407 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field8396;
            }
        }
        var3.finish();
        this.field4613 = arg0.field3462.method2924(var3, null);
    }
}
