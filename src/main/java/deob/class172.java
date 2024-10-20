package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fa")
public final class class172 extends class305 implements Runnable {

    @ObfuscatedName("fa.f")
    public InputStream field2038;

    @ObfuscatedName("fa.i")
    public OutputStream field2037;

    @ObfuscatedName("fa.y")
    public Socket field2036;

    @ObfuscatedName("fa.w")
    public boolean field2039 = false;

    @ObfuscatedName("fa.p")
    public class167 field2043;

    @ObfuscatedName("fa.b")
    public class166 field2041;

    @ObfuscatedName("fa.e")
    public byte[] field2042;

    @ObfuscatedName("fa.x")
    public int field2040 = 0;

    @ObfuscatedName("fa.a")
    public int field2044 = 0;

    @ObfuscatedName("fa.d")
    public boolean field2045 = false;

    @ObfuscatedName("fa.c")
    public final int field2046;

    @ObfuscatedName("fa.o")
    public final int field2047;

    public class172(Socket arg0, class167 arg1, int arg2) throws IOException {
        this.field2043 = arg1;
        this.field2036 = arg0;
        this.field2046 = arg2;
        this.field2047 = arg2 - 100;
        this.field2036.setSoTimeout(30000);
        this.field2036.setTcpNoDelay(true);
        this.field2036.setReceiveBufferSize(65536);
        this.field2036.setSendBufferSize(65536);
        this.field2038 = this.field2036.getInputStream();
        this.field2037 = this.field2036.getOutputStream();
    }

    @ObfuscatedName("fa.f(I)V")
    public void method3191() {
        if (this.field2039) {
            return;
        }
        synchronized (this) {
            this.field2039 = true;
            this.notifyAll();
        }
        if (this.field2041 != null) {
            while (this.field2041.field2010 == 0) {
                class298.method3743(1L);
            }
            if (this.field2041.field2010 == 1) {
                try {
                    ((Thread) this.field2041.field2015).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2041 = null;
    }

    public void finalize() {
        this.method3191();
    }

    @ObfuscatedName("fa.i(I)I")
    public int method3215() throws IOException {
        return this.field2039 ? 0 : this.field2038.read();
    }

    @ObfuscatedName("fa.y(I)I")
    public int method3193() throws IOException {
        return this.field2039 ? 0 : this.field2038.available();
    }

    @ObfuscatedName("fa.w(II)Z")
    public boolean method3194(int arg0) throws IOException {
        if (this.field2039) {
            return false;
        } else {
            return this.field2038.available() >= arg0;
        }
    }

    @ObfuscatedName("fa.p([BIII)I")
    public int method3195(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2039) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2038.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fa.b([BIIB)V")
    public void method3196(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2039) {
            return;
        }
        if (this.field2045) {
            this.field2045 = false;
            throw new IOException();
        }
        if (this.field2042 == null) {
            this.field2042 = new byte[this.field2046];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2042[this.field2044] = arg0[arg1 + var5];
                this.field2044 = (this.field2044 + 1) % this.field2046;
                if ((this.field2047 + this.field2040) % this.field2046 == this.field2044) {
                    throw new IOException();
                }
            }
            if (this.field2041 == null) {
                this.field2041 = this.field2043.method3159(this, 3);
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
                        if (this.field2044 == this.field2040) {
                            if (this.field2039) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2040;
                        if (this.field2044 >= this.field2040) {
                            var4 = this.field2044 - this.field2040;
                        } else {
                            var4 = this.field2046 - this.field2040;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2037.write(this.field2042, var3, var4);
                    } catch (IOException var12) {
                        this.field2045 = true;
                    }
                    this.field2040 = (this.field2040 + var4) % this.field2046;
                    try {
                        if (this.field2044 == this.field2040) {
                            this.field2037.flush();
                        }
                    } catch (IOException var11) {
                        this.field2045 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2038 != null) {
                        this.field2038.close();
                    }
                    if (this.field2037 != null) {
                        this.field2037.close();
                    }
                    if (this.field2036 != null) {
                        this.field2036.close();
                    }
                } catch (IOException var10) {
                }
                this.field2042 = null;
                break;
            }
        } catch (Exception var15) {
            class341.method5815((String) null, var15);
        }
    }

    @ObfuscatedName("fa.e([BIII)V")
    public void method3197(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3196(arg0, arg1, arg2);
    }
}
