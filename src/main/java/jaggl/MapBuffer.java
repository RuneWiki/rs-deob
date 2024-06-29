package jaggl;

import jaclib.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaggl/MapBuffer")
public class MapBuffer extends NativeBuffer {
   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "c",
      descriptor = "I"
   )
   private int field10699;

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "([BIII)V",
      line = 5
   )
   public final void method548(byte[] arg0, int arg1, int arg2, int arg3) {
      if (this.field10699 == 0) {
         throw new RuntimeException();
      } else {
         super.method548(arg0, arg1, arg2, arg3);
      }
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "b",
      descriptor = "()Z",
      line = 16
   )
   public final boolean method5263() {
      boolean var1 = true;
      if (~this.field10699 != -1) {
         var1 = OpenGL.glUnmapBufferARB(this.field10699);
         this.method5255(0L, 0);
         this.field10699 = 0;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "()Z",
      line = 32
   )
   public final boolean method5264() {
      return this.field10699 != 0;
   }

   @OriginalMember(
      owner = "client!jaggl/MapBuffer",
      name = "a",
      descriptor = "(III)Z",
      line = 39
   )
   public final boolean method5265(int arg0, int arg1, int arg2) {
      if (~this.field10699 != -1) {
         return false;
      } else {
         long var4 = OpenGL.glMapBufferARB(arg0, arg2);
         if (var4 == 0L) {
            return false;
         } else {
            this.method5255(var4, arg1);
            this.field10699 = arg0;
            return true;
         }
      }
   }
}
