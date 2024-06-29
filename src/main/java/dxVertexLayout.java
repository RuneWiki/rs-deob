import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class26 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field5052;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lrja;[Lrd;)V", line = 3)
    public dxVertexLayout(class115 arg0, class357[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field1567);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class357 var7 = arg1[var5];
            for (int var8 = 0; var7.method2250((byte) 121) > var8; var8++) {
                class542 var9 = var7.method2245(var8, -4814);
                if (class542.field7354 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class542.field7358 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class542.field7363 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class542.field7364 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class542.field7365 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class542.field7366 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class542.field7367 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field7355;
            }
        }
        var3.finish();
        this.field5052 = arg0.field1565.method2968(var3, null);
    }
}
