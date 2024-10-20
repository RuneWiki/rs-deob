package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fr")
public final class class181 extends class316 implements Runnable {

    @ObfuscatedName("fr.n")
    public InputStream field2083;

    @ObfuscatedName("fr.v")
    public OutputStream field2096;

    @ObfuscatedName("fr.d")
    public Socket field2084;

    @ObfuscatedName("fr.c")
    public boolean field2085 = false;

    @ObfuscatedName("fr.y")
    public class176 field2086;

    @ObfuscatedName("fr.h")
    public class175 field2087;

    @ObfuscatedName("fr.z")
    public byte[] field2091;

    @ObfuscatedName("fr.e")
    public int field2089 = 0;

    @ObfuscatedName("fr.q")
    public int field2090 = 0;

    @ObfuscatedName("fr.l")
    public boolean field2088 = false;

    @ObfuscatedName("fr.s")
    public final int field2092;

    @ObfuscatedName("fr.b")
    public final int field2093;

    public class181(Socket arg0, class176 arg1, int arg2) throws IOException {
        this.field2086 = arg1;
        this.field2084 = arg0;
        this.field2092 = arg2;
        this.field2093 = arg2 - 100;
        this.field2084.setSoTimeout(30000);
        this.field2084.setTcpNoDelay(true);
        this.field2084.setReceiveBufferSize(65536);
        this.field2084.setSendBufferSize(65536);
        this.field2083 = this.field2084.getInputStream();
        this.field2096 = this.field2084.getOutputStream();
    }

    @ObfuscatedName("fr.n(I)V")
    public void method3413() {
        if (this.field2085) {
            return;
        }
        synchronized (this) {
            this.field2085 = true;
            this.notifyAll();
        }
        if (this.field2087 != null) {
            while (this.field2087.field2039 == 0) {
                class309.method1173(1L);
            }
            if (this.field2087.field2039 == 1) {
                try {
                    ((Thread) this.field2087.field2043).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2087 = null;
    }

    public void finalize() {
        this.method3413();
    }

    @ObfuscatedName("fr.v(B)I")
    public int method3414() throws IOException {
        return this.field2085 ? 0 : this.field2083.read();
    }

    @ObfuscatedName("fr.d(B)I")
    public int method3415() throws IOException {
        return this.field2085 ? 0 : this.field2083.available();
    }

    @ObfuscatedName("fr.c(II)Z")
    public boolean method3418(int arg0) throws IOException {
        if (this.field2085) {
            return false;
        } else {
            return this.field2083.available() >= arg0;
        }
    }

    @ObfuscatedName("fr.y([BIIB)I")
    public int method3428(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2085) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2083.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fr.h([BIII)V")
    public void method3421(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2085) {
            return;
        }
        if (this.field2088) {
            this.field2088 = false;
            throw new IOException();
        }
        if (this.field2091 == null) {
            this.field2091 = new byte[this.field2092];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2091[this.field2090] = arg0[arg1 + var5];
                this.field2090 = (this.field2090 + 1) % this.field2092;
                if ((this.field2093 + this.field2089) % this.field2092 == this.field2090) {
                    throw new IOException();
                }
            }
            if (this.field2087 == null) {
                this.field2087 = this.field2086.method3387(this, 3);
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
                        if (this.field2090 == this.field2089) {
                            if (this.field2085) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2089;
                        if (this.field2090 >= this.field2089) {
                            var4 = this.field2090 - this.field2089;
                        } else {
                            var4 = this.field2092 - this.field2089;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2096.write(this.field2091, var3, var4);
                    } catch (IOException var12) {
                        this.field2088 = true;
                    }
                    this.field2089 = (this.field2089 + var4) % this.field2092;
                    try {
                        if (this.field2090 == this.field2089) {
                            this.field2096.flush();
                        }
                    } catch (IOException var11) {
                        this.field2088 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2083 != null) {
                        this.field2083.close();
                    }
                    if (this.field2096 != null) {
                        this.field2096.close();
                    }
                    if (this.field2084 != null) {
                        this.field2084.close();
                    }
                } catch (IOException var10) {
                }
                this.field2091 = null;
                break;
            }
        } catch (Exception var15) {
            class352.method4617((String) null, var15);
        }
    }

    @ObfuscatedName("fr.z([BIII)V")
    public void method3419(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3421(arg0, arg1, arg2);
    }
}
