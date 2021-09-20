package hangman.setup.factoryMethod;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hangman.model.English;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.setup.guice.HangmanFactoryServices;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public HangmanDictionary createDictionary() {
        return new EnglishDictionaryDataSource();
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        return new HangmanStickmanPanel();
    }
    
    @Override
    public GameScore createGameScore() {
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(GameScore.class);
    }
}
