package com.myflappy.jemozstudio.States;

/*
 * Copyright (c) 2019 Jemoz Studio.
 * Здесь вы не увидете красивого кода.
 * Добавляй коментарии к коду!!!
 *
 */

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.myflappy.jemozstudio.Main;


public class MenuState extends State {

    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, V.WIDTH, V.HEIGHT);
        sb.draw(playBtn, (V.WIDTH / 2) - (playBtn.getWidth() / 2), V.HEIGHT / 2, V.WIDTH/3, V.HEIGHT /5);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();

    }
}
