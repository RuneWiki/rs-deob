package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fh")
public final class class162 extends class378 implements Runnable {

    @ObfuscatedName("fh.o")
    public Socket field1788;

    @ObfuscatedName("fh.q")
    public InputStream field1789;

    @ObfuscatedName("fh.l")
    public OutputStream field1787;

    @ObfuscatedName("fh.k")
    public boolean field1797 = false;

    @ObfuscatedName("fh.a")
    public class157 field1790;

    @ObfuscatedName("fh.m")
    public class166 field1791;

    @ObfuscatedName("fh.p")
    public byte[] field1792;

    @ObfuscatedName("fh.s")
    public int field1793 = 0;

    @ObfuscatedName("fh.r")
    public int field1794 = 0;

    @ObfuscatedName("fh.v")
    public boolean field1795 = false;

    @ObfuscatedName("fh.y")
    public final int field1796;

    @ObfuscatedName("fh.c")
    public final int field1800;

    public class162(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field1790 = arg1;
        this.field1788 = arg0;
        this.field1796 = arg2;
        this.field1800 = arg2 - 100;
        this.field1788.setSoTimeout(30000);
        this.field1788.setTcpNoDelay(true);
        this.field1788.setReceiveBufferSize(65536);
        this.field1788.setSendBufferSize(65536);
        this.field1789 = this.field1788.getInputStream();
        this.field1787 = this.field1788.getOutputStream();
    }

    @ObfuscatedName("fh.o(I)V")
    public void method2910() {
        if (this.field1797) {
            return;
        }
        synchronized (this) {
            this.field1797 = true;
            this.notifyAll();
        }
        if (this.field1791 != null) {
            while (this.field1791.field1826 == 0) {
                class271.method4446(1L);
            }
            if (this.field1791.field1826 == 1) {
                try {
                    ((Thread) this.field1791.field1830).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1791 = null;
    }

    public void finalize() {
        this.method2910();
    }

    @ObfuscatedName("fh.q(B)I")
    public int method2912() throws IOException {
        return this.field1797 ? 0 : this.field1789.read();
    }

    @ObfuscatedName("fh.l(I)I")
    public int method2941() throws IOException {
        return this.field1797 ? 0 : this.field1789.available();
    }

    @ObfuscatedName("fh.k(II)Z")
    public boolean method2928(int arg0) throws IOException {
        if (this.field1797) {
            return false;
        } else {
            return this.field1789.available() >= arg0;
        }
    }

    @ObfuscatedName("fh.a([BIII)I")
    public int method2915(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1797) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1789.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fh.m([BIII)V")
    public void method2916(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1797) {
            return;
        }
        if (this.field1795) {
            this.field1795 = false;
            throw new IOException();
        }
        if (this.field1792 == null) {
            this.field1792 = new byte[this.field1796];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1792[this.field1794] = arg0[arg1 + var5];
                this.field1794 = (this.field1794 + 1) % this.field1796;
                if ((this.field1800 + this.field1793) % this.field1796 == this.field1794) {
                    throw new IOException();
                }
            }
            if (this.field1791 == null) {
                this.field1791 = this.field1790.method2882(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field1794 == this.field1793) {
                            if (this.field1797) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1793;
                        if (this.field1794 >= this.field1793) {
                            var4 = this.field1794 - this.field1793;
                        } else {
                            var4 = this.field1796 - this.field1793;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1787.write(this.field1792, var3, var4);
                    } catch (IOException var12) {
                        this.field1795 = true;
                    }
                    this.field1793 = (this.field1793 + var4) % this.field1796;
                    try {
                        if (this.field1794 == this.field1793) {
                            this.field1787.flush();
                        }
                    } catch (IOException var11) {
                        this.field1795 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1789 != null) {
                        this.field1789.close();
                    }
                    if (this.field1787 != null) {
                        this.field1787.close();
                    }
                    if (this.field1788 != null) {
                        this.field1788.close();
                    }
                } catch (IOException var10) {
                }
                this.field1792 = null;
                break;
            }
        } catch (Exception var15) {
            class464.method5148((String) null, var15);
        }
    }

    @ObfuscatedName("fh.p([BIII)V")
    public void method2913(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2916(arg0, arg1, arg2);
    }
}
