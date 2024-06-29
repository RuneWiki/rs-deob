import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dxVertexLayout")
public class dxVertexLayout extends class371 {
   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "g",
      descriptor = "Ljagdx/IDirect3DVertexDeclaration;"
   )
   public IDirect3DVertexDeclaration field2889;

   @OriginalMember(
      owner = "client!dxVertexLayout",
      name = "<init>",
      descriptor = "(Leb;[Ldr;)V",
      line = 3
   )
   public dxVertexLayout(class163 arg0, class570[] arg1) {
      VertexElementCollection var3 = new VertexElementCollection(arg0.field2424);
      int var4 = 0;

      for(int var5 = 0; arg1.length > var5; ++var5) {
         int var6 = 0;
         class570 var7 = arg1[var5];

         for(int var8 = 0; ~var8 > ~var7.method4283(6); ++var8) {
            class42 var9 = var7.method4288(var8, -26556);
            if (class42.field552 == var9) {
               var3.addElement(var5, 2, 0, 0, 0, var6);
            } else if (class42.field555 == var9) {
               var3.addElement(var5, 2, 0, 3, 0, var6);
            } else if (class42.field558 != var9) {
               if (class42.field559 == var9) {
                  var3.addElement(var5, 0, 0, 5, var4++, var6);
               } else if (class42.field560 == var9) {
                  var3.addElement(var5, 1, 0, 5, var4++, var6);
               } else if (class42.field561 != var9) {
                  if (class42.field562 == var9) {
                     var3.addElement(var5, 3, 0, 5, var4++, var6);
                  }
               } else {
                  var3.addElement(var5, 2, 0, 5, var4++, var6);
               }
            } else {
               var3.addElement(var5, 4, 0, 10, 0, var6);
            }

            var6 += var9.field556;
         }
      }

      var3.finish();
      this.field2889 = arg0.field2447.method567(var3, (IDirect3DVertexDeclaration)null);
   }
}
