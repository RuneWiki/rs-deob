package jaclib.peer;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/peer/ia")
public class class701 {
   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "c",
      descriptor = "Ljava/lang/ref/ReferenceQueue;"
   )
   public ReferenceQueue field10518 = new ReferenceQueue();
   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "a",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10519;
   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "b",
      descriptor = "Ljaclib/peer/PeerReference;"
   )
   private PeerReference field10520;

   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "a",
      descriptor = "(ILjaclib/peer/PeerReference;)V",
      line = 5
   )
   private final void method5107(int arg0, PeerReference arg1) {
      arg1.method5104(true);
      if (this.field10520 == arg1) {
         this.field10520 = arg1.field10516;
      }

      if (this.field10519 == arg1) {
         this.field10519 = arg1.field10517;
      }

      if (arg0 != 1345) {
         this.method5111((byte)30);
      }

      if (arg1.field10516 != null) {
         arg1.field10516.field10517 = arg1.field10517;
      }

      if (arg1.field10517 != null) {
         arg1.field10517.field10516 = arg1.field10516;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public final void method5108(int arg0) {
      this.method5111((byte)-71);
      if (arg0 != -5708) {
         this.field10518 = (ReferenceQueue)null;
      }

   }

   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "a",
      descriptor = "(B)V",
      line = 39
   )
   public final void method5109(byte arg0) {
      if (arg0 <= -36) {
         this.method5111((byte)-71);

         while(this.field10519 != null) {
            this.method5107(1345, this.field10519);
         }

         this.method5111((byte)-71);
      }
   }

   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "a",
      descriptor = "(BLjaclib/peer/PeerReference;)V",
      line = 54
   )
   public final void method5110(byte arg0, PeerReference arg1) {
      int var3 = 44 % ((arg0 - 83) / 39);
      arg1.field10516 = null;
      arg1.field10517 = this.field10519;
      if (this.field10520 == null) {
         this.field10520 = arg1;
      } else {
         this.field10519.field10516 = arg1;
      }

      this.field10519 = arg1;
   }

   @OriginalMember(
      owner = "client!jaclib/peer/ia",
      name = "b",
      descriptor = "(B)V",
      line = 74
   )
   private final void method5111(byte arg0) {
      while(true) {
         Reference var2 = this.field10518.poll();
         if (var2 == null) {
            if (arg0 != -71) {
               this.method5109((byte)120);
            }

            return;
         }

         PeerReference var3 = (PeerReference)var2;
         this.method5107(arg0 + 1416, var3);
      }
   }
}
