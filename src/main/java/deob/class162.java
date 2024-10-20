package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fd")
public final class class162 extends class377 implements Runnable {

    @ObfuscatedName("fd.v")
    public InputStream field1747;

    @ObfuscatedName("fd.c")
    public OutputStream field1740;

    @ObfuscatedName("fd.i")
    public Socket field1741;

    @ObfuscatedName("fd.f")
    public boolean field1743 = false;

    @ObfuscatedName("fd.b")
    public class157 field1744;

    @ObfuscatedName("fd.n")
    public class166 field1745;

    @ObfuscatedName("fd.s")
    public byte[] field1746;

    @ObfuscatedName("fd.l")
    public int field1742 = 0;

    @ObfuscatedName("fd.q")
    public int field1748 = 0;

    @ObfuscatedName("fd.o")
    public boolean field1749 = false;

    @ObfuscatedName("fd.r")
    public final int field1750;

    @ObfuscatedName("fd.p")
    public final int field1751;

    public class162(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field1744 = arg1;
        this.field1741 = arg0;
        this.field1750 = arg2;
        this.field1751 = arg2 - 100;
        this.field1741.setSoTimeout(30000);
        this.field1741.setTcpNoDelay(true);
        this.field1741.setReceiveBufferSize(65536);
        this.field1741.setSendBufferSize(65536);
        this.field1747 = this.field1741.getInputStream();
        this.field1740 = this.field1741.getOutputStream();
    }

    @ObfuscatedName("fd.v(S)V")
    public void method2972() {
        if (this.field1743) {
            return;
        }
        synchronized (this) {
            this.field1743 = true;
            this.notifyAll();
        }
        if (this.field1745 != null) {
            while (this.field1745.field1779 == 0) {
                class271.method2274(1L);
            }
            if (this.field1745.field1779 == 1) {
                try {
                    ((Thread) this.field1745.field1774).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1745 = null;
    }

    public void finalize() {
        this.method2972();
    }

    @ObfuscatedName("fd.c(I)I")
    public int method2971() throws IOException {
        return this.field1743 ? 0 : this.field1747.read();
    }

    @ObfuscatedName("fd.i(B)I")
    public int method2974() throws IOException {
        return this.field1743 ? 0 : this.field1747.available();
    }

    @ObfuscatedName("fd.f(IB)Z")
    public boolean method2987(int arg0) throws IOException {
        if (this.field1743) {
            return false;
        } else {
            return this.field1747.available() >= arg0;
        }
    }

    @ObfuscatedName("fd.b([BIIB)I")
    public int method2988(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1743) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field1747.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fd.n([BIII)V")
    public void method2977(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1743) {
            return;
        }
        if (this.field1749) {
            this.field1749 = false;
            throw new IOException();
        }
        if (this.field1746 == null) {
            this.field1746 = new byte[this.field1750];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field1746[this.field1748] = arg0[arg1 + var5];
                this.field1748 = (this.field1748 + 1) % this.field1750;
                if ((this.field1751 + this.field1742) % this.field1750 == this.field1748) {
                    throw new IOException();
                }
            }
            if (this.field1745 == null) {
                this.field1745 = this.field1744.method2941(this, 3);
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
                        if (this.field1748 == this.field1742) {
                            if (this.field1743) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field1742;
                        if (this.field1748 >= this.field1742) {
                            var4 = this.field1748 - this.field1742;
                        } else {
                            var4 = this.field1750 - this.field1742;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field1740.write(this.field1746, var3, var4);
                    } catch (IOException var12) {
                        this.field1749 = true;
                    }
                    this.field1742 = (this.field1742 + var4) % this.field1750;
                    try {
                        if (this.field1748 == this.field1742) {
                            this.field1740.flush();
                        }
                    } catch (IOException var11) {
                        this.field1749 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1747 != null) {
                        this.field1747.close();
                    }
                    if (this.field1740 != null) {
                        this.field1740.close();
                    }
                    if (this.field1741 != null) {
                        this.field1741.close();
                    }
                } catch (IOException var10) {
                }
                this.field1746 = null;
                break;
            }
        } catch (Exception var15) {
            class462.method5173((String) null, var15);
        }
    }

    @ObfuscatedName("fd.s([BIII)V")
    public void method2992(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2977(arg0, arg1, arg2);
    }
}
