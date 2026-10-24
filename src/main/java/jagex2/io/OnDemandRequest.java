package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable2;

@ObfuscatedName("mb")
public class OnDemandRequest extends Linkable2 {

	@ObfuscatedName("mb.i")
	public int archive;

	@ObfuscatedName("mb.j")
	public int file;

	@ObfuscatedName("mb.k")
	public byte[] data;

	@ObfuscatedName("mb.l")
	public int cycle;

	@ObfuscatedName("mb.m")
	public boolean urgent = true;
}
