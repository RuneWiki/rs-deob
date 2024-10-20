package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fw")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fw.v")
    public InputStream field2042;

    @ObfuscatedName("fw.s")
    public OutputStream field2039;

    @ObfuscatedName("fw.o")
    public Socket field2040;

    @ObfuscatedName("fw.k")
    public boolean field2041 = false;

    @ObfuscatedName("fw.u")
    public class157 field2050;

    @ObfuscatedName("fw.i")
    public class156 field2048;

    @ObfuscatedName("fw.t")
    public byte[] field2044;

    @ObfuscatedName("fw.p")
    public int field2045 = 0;

    @ObfuscatedName("fw.l")
    public int field2046 = 0;

    @ObfuscatedName("fw.b")
    public boolean field2047 = false;

    @ObfuscatedName("fw.c")
    public final int field2038;

    @ObfuscatedName("fw.d")
    public final int field2043;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2050 = arg1;
        this.field2040 = arg0;
        this.field2038 = arg2;
        this.field2043 = arg2 - 100;
        this.field2040.setSoTimeout(30000);
        this.field2040.setTcpNoDelay(true);
        this.field2040.setReceiveBufferSize(65536);
        this.field2040.setSendBufferSize(65536);
        this.field2042 = this.field2040.getInputStream();
        this.field2039 = this.field2040.getOutputStream();
    }

    @ObfuscatedName("fw.t(I)V")
    public void method3036() {
        if (this.field2041) {
            return;
        }
        synchronized (this) {
            this.field2041 = true;
            this.notifyAll();
        }
        if (this.field2048 != null) {
            while (this.field2048.field1992 == 0) {
                class194.method668(1L);
            }
            if (this.field2048.field1992 == 1) {
                try {
                    ((Thread) this.field2048.field1988).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2048 = null;
    }

    public void finalize() {
        this.method3036();
    }

    @ObfuscatedName("fw.k(I)I")
    public int method3051() throws IOException {
        return this.field2041 ? 0 : this.field2042.read();
    }

    @ObfuscatedName("fw.o(I)I")
    public int method3038() throws IOException {
        return this.field2041 ? 0 : this.field2042.available();
    }

    @ObfuscatedName("fw.s(II)Z")
    public boolean method3037(int arg0) throws IOException {
        if (this.field2041) {
            return false;
        } else {
            return this.field2042.available() >= arg0;
        }
    }

    @ObfuscatedName("fw.u([BIII)I")
    public int method3042(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2042.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fw.ay([BIIB)V")
    public void method3070(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2041) {
            return;
        }
        if (this.field2047) {
            this.field2047 = false;
            throw new IOException();
        }
        if (this.field2044 == null) {
            this.field2044 = new byte[this.field2038];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2044[this.field2046] = arg0[arg1 + var5];
                this.field2046 = (this.field2046 + 1) % this.field2038;
                if ((this.field2045 + this.field2043) % this.field2038 == this.field2046) {
                    throw new IOException();
                }
            }
            if (this.field2048 == null) {
                this.field2048 = this.field2050.method3004(this, 3);
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
                        if (this.field2046 == this.field2045) {
                            if (this.field2041) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2045;
                        if (this.field2046 >= this.field2045) {
                            var4 = this.field2046 - this.field2045;
                        } else {
                            var4 = this.field2038 - this.field2045;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2039.write(this.field2044, var3, var4);
                    } catch (IOException var12) {
                        this.field2047 = true;
                    }
                    this.field2045 = (this.field2045 + var4) % this.field2038;
                    try {
                        if (this.field2046 == this.field2045) {
                            this.field2039.flush();
                        }
                    } catch (IOException var11) {
                        this.field2047 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2042 != null) {
                        this.field2042.close();
                    }
                    if (this.field2039 != null) {
                        this.field2039.close();
                    }
                    if (this.field2040 != null) {
                        this.field2040.close();
                    }
                } catch (IOException var10) {
                }
                this.field2044 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method2337((String) null, var15);
        }
    }

    @ObfuscatedName("fw.i([BIII)V")
    public void method3041(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3070(arg0, arg1, arg2);
    }
}
