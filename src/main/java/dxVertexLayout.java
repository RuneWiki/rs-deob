import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class171 {

    @OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Ljagdx/IDirect3DVertexDeclaration;")
    public IDirect3DVertexDeclaration field4663;

    @OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lmh;[Llm;)V", line = 3)
    public dxVertexLayout(class632 arg0, class502[] arg1) {
        VertexElementCollection var3 = new VertexElementCollection(arg0.field8412);
        int var4 = 0;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = 0;
            class502 var7 = arg1[var5];
            for (int var8 = 0; var8 < var7.method2825((byte) -98); var8++) {
                class143 var9 = var7.method2827(-24713, var8);
                if (class143.field2281 == var9) {
                    var3.addElement(var5, 2, 0, 0, 0, var6);
                } else if (class143.field2282 == var9) {
                    var3.addElement(var5, 2, 0, 3, 0, var6);
                } else if (class143.field2283 == var9) {
                    var3.addElement(var5, 4, 0, 10, 0, var6);
                } else if (class143.field2284 == var9) {
                    var3.addElement(var5, 0, 0, 5, var4++, var6);
                } else if (class143.field2285 == var9) {
                    var3.addElement(var5, 1, 0, 5, var4++, var6);
                } else if (class143.field2286 == var9) {
                    var3.addElement(var5, 2, 0, 5, var4++, var6);
                } else if (class143.field2287 == var9) {
                    var3.addElement(var5, 3, 0, 5, var4++, var6);
                }
                var6 += var9.field2277;
            }
        }
        var3.finish();
        this.field4663 = arg0.field8422.method2751(var3, null);
    }
}
