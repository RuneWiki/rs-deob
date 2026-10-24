package jagex2.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("pb")
public final class LinkList2 {

	@ObfuscatedName("pb.d")
	public Linkable2 sentinel = new Linkable2();

	public LinkList2() {
		sentinel.next2 = sentinel;
		sentinel.prev2 = sentinel;
	}

	@ObfuscatedName("pb.a(Ldb;)V")
	public void push(Linkable2 arg0) {
		if (arg0.prev2 != null) {
			arg0.unlink2();
		}

		arg0.prev2 = sentinel.prev2;
		arg0.next2 = sentinel;
		arg0.prev2.next2 = arg0;
		arg0.next2.prev2 = arg0;
	}

	@ObfuscatedName("pb.a()Ldb;")
	public Linkable2 popFront() {
		Linkable2 var1 = sentinel.next2;
		if (sentinel == var1) {
			return null;
		} else {
			var1.unlink2();
			return var1;
		}
	}
}
